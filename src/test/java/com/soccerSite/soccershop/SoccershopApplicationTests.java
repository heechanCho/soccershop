//package com.soccerSite.soccershop;
//
//import com.soccerSite.soccershop.entity.Answer;
//import com.soccerSite.soccershop.entity.Board;
//import com.soccerSite.soccershop.repository.AnswerRepository;
//import com.soccerSite.soccershop.repository.BoardRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringBootTest
//class SoccershopApplicationTests {
//
//    @Autowired
//    private BoardRepository questionRepository;
//
//    @Autowired
//    private AnswerRepository answerRepository;
//
//    @Test
//    void testJpa() {
//        Board q1 = new Board();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Board q2 = new Board();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);
//    }
//
//    @Test
//    void testJpa02() {
//        List<Board> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Board q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//    }
//
//    @Test
//    void test() {
//        List<Board> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Board q = all.get(1);
//        assertEquals("스프링부트 모델 질문입니다.", q.getSubject());
//    }
//
////    @Test
////    void testJpa03() {
////        Optional<Board> oq = this.questionRepository.findById(1);
////        if (oq.isPresent()) {
////            Board q = oq.get();
////            assertEquals("sbb가 무엇인가요?", q.getSubject());
////        }
////    }
////
////    @Test
////    void test02() {
////        Optional<Board> oq = this.questionRepository.findById(2);
////        if (oq.isPresent()) {
////            Board q = oq.get();
////            assertEquals("스프링부트 모델 질문입니다.", q.getSubject());
////        }
////    }
//
//    @Test
//    void testJpa04() {
//        Board q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1, q.getId());
//    }
//
//    @Test
//    void test03() {
//        Board q = this.questionRepository.findBySubject("스프링부트 모델 질문입니다.");
//        assertEquals(2, q.getId());
//    }
//
//    @Test
//    void testJpa05() {
//        Board q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//        assertEquals(1, q.getId());
//    }
//
////    Question q2 = new Question();
////        q2.setSubject("스프링부트 모델 질문입니다.");
////        q2.setContent("id는 자동으로 생성되나요?");
////        q2.setCreateDate(LocalDateTime.now());
////        this.questionRepository.save(q2);
//
//    @Test
//    void test04() {
//        Board q = this.questionRepository.findBySubjectAndContent("스프링부트 모델 질문입니다.", "id는 자동으로 생성되나요?");
//        assertEquals(2, q.getId());
//    }
//
//    @Test
//    void testJpa06() {
//        List<Board> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Board q = qList.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//    }
//
//    @Test
//    void test05() {
//        List<Board> qList = this.questionRepository.findBySubjectLike("스프링%");
//        Board q = qList.get(0);
//        assertEquals("스프링부트 모델 질문입니다.", q.getSubject());
//    }
//
//    @Test
//    void testJpa07() {
//        Optional<Board> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);
//    }
//
//    @Test
//    void changeContent() {
//        Optional<Board> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//        q.setContent("수정된 본문");
//        this.questionRepository.save(q);
//    }
//    @Test
//    void test06() {
//        Optional<Board> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//        q.setSubject("수정된 제목02");
//        this.questionRepository.save(q);
//    }
//
//    @Test
//    void testJpa08() {
//        Optional<Board> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }
//
//    @Test
//    void test07() {
//        Optional<Board> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("sbb는 sbb입니다.");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }
//
//    @Test
//    void testJpa09() {
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());
//    }
//
//    @Transactional
//    @Test
//    void testJpa10() {
//        Optional<Board> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Board q = oq.get();
//
//        List<Answer> answerList = q.getAnswerList();
//
//        assertEquals(1, answerList.size());
//        assertEquals("네 자동으로 생성됩니다.", answ˚erList.get(0).getContent());
//    }
//}
