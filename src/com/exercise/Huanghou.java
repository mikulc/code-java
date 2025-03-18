package com.exercise;

/**
 * 八皇后
 *
 * @since 2024-05-03
 */
public class Huanghou {
    public static void main(String[] args) {
        int[][] map = new int[8][8];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

}

//class Solution {
//    //x为第一行放置的位置
//    public boolean findWay(int[][] map, int x) {
//
//}