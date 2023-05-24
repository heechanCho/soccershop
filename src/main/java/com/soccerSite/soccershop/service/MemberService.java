package com.soccerSite.soccershop.service;

import com.soccerSite.soccershop.entity.Board;
import com.soccerSite.soccershop.entity.Member;
import com.soccerSite.soccershop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public Member saveMember(Member member) {
        validateDuplicateMember(member);
        return memberRepository.save(member);
    }

    /**
     * 이메일을 가져온뒤 null이 아니면 "이미 가입된 회원 입니다" 출력
     *
     * @param member
     */
    private void validateDuplicateMember(Member member) {
        Member findMember = memberRepository.findByEmail(member.getEmail());
        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

    /**
     * 회원정보 저장을 위해 UserDetail 사용
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException { // 로그인할 유저의 이메일을 받아옴

        Member member = memberRepository.findByEmail(email);

        if (member == null) {
            throw new UsernameNotFoundException(email);
        }

        return User.builder() // 로그인할 유저의 이메일 패스워드 role을 넘겨줌
                .username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }

    public Member findMemberByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

}
