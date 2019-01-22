package com.lzx.musiclib;

import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;

import com.lzx.starrysky.MediaSessionConnection;
import com.lzx.starrysky.MusicService;
import com.lzx.starrysky.model.MusicProvider;
import com.lzx.starrysky.model.SongInfo;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IndexActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SongInfo s1 = new SongInfo();
//        s1.setSongId("111");
//        s1.setSongUrl("http://music.163.com/song/media/outer/url?id=317151.mp3");
//
//        SongInfo s2 = new SongInfo();
//        s2.setSongId("222");
//        s2.setSongUrl("http://music.163.com/song/media/outer/url?id=281951.mp3");
//
//        SongInfo s3 = new SongInfo();
//        s3.setSongId("333");
//        s3.setSongUrl("http://music.163.com/song/media/outer/url?id=25906124.mp3");
//
//        List<SongInfo> songInfos = new ArrayList<>();
//        songInfos.add(s1);
//        songInfos.add(s2);
//        songInfos.add(s3);
//
//
//        MusicProvider
        MediaSessionConnection connection = new MediaSessionConnection(this, new ComponentName(this, MusicService.class));
        findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connection.getTransportControls().playFromMediaId("111", null);
            }
        });
    }
}
