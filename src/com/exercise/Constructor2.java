package com.exercise;

/**
 * 构造器初始化练习
 *
 * @since 2024-05-04
 */
public class Constructor2 {
    public static void main(String[] args) {
        Music music = new Music("晴天", 5.20);
        music.play();
        System.out.println(music.getInfo());
    }
}

class Music {
    String musicName;
    double musicTime;

    public Music(String musicName, double musicTime) {
        this.musicName = musicName;
        this.musicTime = musicTime;
    }

    public void play() {
        System.out.println("正在播放");
    }

    public String getInfo() {
        String musicInfo = "音乐名字为：" + this.musicName + "\n" + "时长为：" + musicTime;
        return musicInfo;
    }
}