package com.lzx.musiclib


import android.content.ComponentName
import android.content.Context
import android.os.Bundle
import android.view.View

import com.lzx.starrysky.model.MusicProvider
import com.lzx.starrysky.model.SongInfo

import java.util.ArrayList

import androidx.appcompat.app.AppCompatActivity
import com.lzx.starrysky.MediaSessionConnection
import com.lzx.starrysky.MusicService


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s1 = SongInfo()
        s1.songId = "111"
        s1.songUrl = "http://music.163.com/song/media/outer/url?id=317151.mp3"

        val s2 = SongInfo()
        s2.songId = "222"
        s2.songUrl = "http://music.163.com/song/media/outer/url?id=281951.mp3"

        val s3 = SongInfo()
        s3.songId = "333"
        s3.songUrl = "http://music.163.com/song/media/outer/url?id=25906124.mp3"

        val songInfos = ArrayList<SongInfo>()
        songInfos.add(s1)
        songInfos.add(s2)
        songInfos.add(s3)

        MusicProvider.getInstance(this).songInfos = songInfos;

        val mediaSessionConnection = MediaSessionConnection.getInstance(this, ComponentName(this, MusicService::class.java))
        mediaSessionConnection.transportControls.playFromMediaId("111", null)

    }

}
