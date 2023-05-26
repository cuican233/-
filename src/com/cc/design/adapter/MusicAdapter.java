package com.cc.design.adapter;

/**
 * @author CC
 * @date 2023/5/23
 */
public class MusicAdapter {
    private MediaPlayer mediaPlayer;
    private  AdvancedMediaPlayer advancedMediaPlayer;

    public MusicAdapter(MediaPlayer mediaPlayer, AdvancedMediaPlayer advancedMediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public void play(String type, String fileName){
        if(type.equals("mp3")){
            mediaPlayer.playMp3(fileName);
        }
        else if(type.equals("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(type.equals("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
        else{
            System.out.println("格式不支持播放！");
        }
    }

}

interface MediaPlayer{
    public void playMp3(String fileName);
}

interface AdvancedMediaPlayer{
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}

class mp3Media implements MediaPlayer{

    @Override
    public void playMp3(String fileName) {
        System.out.println(fileName+"正在播放...");
    }
}

class AdMedia implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println(fileName+"正在播放...");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println(fileName+"正在播放...");
    }
}

class demo{
    public static void main(String[] args) {
        MusicAdapter musicAdapter = new MusicAdapter(new mp3Media(), new AdMedia());
        musicAdapter.play("mp3","雪distance.mp3");

        musicAdapter.play("vlc","烟distance.vlc");

        musicAdapter.play("mp4","zood.mp4");
    }
}