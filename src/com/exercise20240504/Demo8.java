package com.exercise20240504;

public class Demo8 {
    public static void main(String[] args) {
        Music music = new Music("晴天", 5.20);
        music.play();
        System.out.println(music.getInfo());
    }
}

class Music {
    String musicNmae;
    double musicTime;

    public Music(String musicNmae, double musicTime) {
        this.musicNmae = musicNmae;
        this.musicTime = musicTime;
    }

    public void play() {
        System.out.println("正在播放");
    }
    public String getInfo() {
        String musicInfo = "音乐名字为：" + this.musicNmae + "\n" +"时长为：" + musicTime;
        return musicInfo;
    }
}