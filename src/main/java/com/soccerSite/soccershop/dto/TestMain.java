package com.soccerSite.soccershop.dto;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<String> answerList = new ArrayList<>();
        answerList.add("Anser 1");
        answerList.add("aa");

        Integer aa = answerList.size();
        String bb = answerList.get(0);
        System.out.println(aa);
        System.out.println(bb);


    }
}
