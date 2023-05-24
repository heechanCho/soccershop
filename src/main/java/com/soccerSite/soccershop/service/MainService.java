package com.soccerSite.soccershop.service;

import com.soccerSite.soccershop.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MainService {

    private final BoardRepository questionRepository;


}
