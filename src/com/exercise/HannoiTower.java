package com.exercise;

/**
 * 汉诺塔
 *
 * @since 2024-05-03
 */
public class HannoiTower {
    public static void main(String[] args) {
        Tower t = new Tower();
        t.move(2, 'A', 'B', 'C');
    }
}


class Tower {
    //num代表盘子的个数，a代表第一个柱子，b代表第二个柱子，c代表第三个柱子
    public void move(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            move(num - 1, a, c, b);
            System.out.println(a + "->" + c);
            move(num - 1, b, a, c);
        }
    }
}