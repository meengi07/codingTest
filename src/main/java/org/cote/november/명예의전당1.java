package org.cote.november;

import java.util.ArrayList;
import java.util.Comparator;

public class 명예의전당1 {

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> top = new ArrayList<>();
        for(int i=0; i<score.length; i++) {

            if(i < k) {
                top.add(score[i]);
                top.sort(Comparator.reverseOrder());
                answer[i] = top.get(i);
            } else {
                top.add(k, score[i]);
                top.sort(Comparator.reverseOrder());
                top.remove(k);
                answer[i] = top.get(k-1);
            }
        }
        return answer;
    }
    // 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/138477
    // 풀이 : https://goodthinking.tistory.com/82

}
