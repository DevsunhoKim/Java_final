package com.sist.client;

import javax.swing.*;
import java.awt.*;
public class MenuPanel3 extends JPanel {
    public JButton b1, b2, b3, b4, b5, b6;

    public MenuPanel3() {
        b1 = new JButton("HOME");
        b2 = new JButton("도서 검색");
        b3 = new JButton("실시간 도서추천 채팅");
        b4 = new JButton("커뮤니티");
        b5 = new JButton("뉴스 검색");
        b6 = new JButton("종료");

        setLayout(new GridLayout(6, 1, 10, 10)); // 6행 1열 그리드 레이아웃
        // 추가: 각 버튼 사이에 여백 추가
        b1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        b2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        b3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        b4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        b5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        b6.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // 추가: 각 버튼의 크기를 고정 (원하는 크기로 조정)
        b1.setPreferredSize(new Dimension(150, 40));
        b2.setPreferredSize(new Dimension(150, 40));
        b3.setPreferredSize(new Dimension(150, 40));
        b4.setPreferredSize(new Dimension(150, 40));
        b5.setPreferredSize(new Dimension(150, 40));
        b6.setPreferredSize(new Dimension(150, 40));

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

