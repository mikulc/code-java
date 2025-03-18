package com.exercise;

/**
 * 数组迷宫练习
 *
 * @since 2024-05-02
 */
public class Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //设置上下两行全为一,遍历第一行和最后一行的所有列
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //设置左右两边全为一，遍历第一列和最后一列的所有行
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置中间障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;   //测试回溯

        //运行
        T1 t1 = new T1();
        t1.findWay(map, 1, 1);  //初始化老鼠的位置
        //打印结果
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class T1 {
    //i和j表示老鼠的位置
    //定义0表示可以走，1表示障碍物，2走过表示可以走，3表示走过，但是走不通
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
