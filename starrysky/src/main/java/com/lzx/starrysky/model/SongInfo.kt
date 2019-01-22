package com.lzx.starrysky.model

import android.graphics.Bitmap

class SongInfo {
    var songId = "" //音乐id
    var songName = "" //音乐标题
    var songCover = "" //音乐封面
    var songHDCover = "" //专辑封面(高清)
    var songSquareCover = "" //专辑封面(正方形)
    var songRectCover = "" //专辑封面(矩形)
    var songRoundCover = "" //专辑封面(圆形)
    var songCoverBitmap: Bitmap? = null
    var songUrl = "" //音乐播放地址
    var genre = "" //类型（流派）
    var type = "" //类型
    var size = "0" //音乐大小
    var duration: Long = 0 //音乐长度
    var artist = "" //音乐艺术家
    var artistId = "" //音乐艺术家id
    var downloadUrl = "" //音乐下载地址
    var site = "" //地点
    var favorites = 0 //喜欢数
    var playCount = 0 //播放数
    var trackNumber: Long = 0 //媒体的曲目号码（序号：1234567……）
    var language = ""//语言
    var country = "" //地区
    var proxyCompany = ""//代理公司
    var publishTime = ""//发布时间
    var description = "" //音乐描述
    var versions = "" //版本

    var albumId = ""    //专辑id
    var albumName = ""  //专辑名称
    var albumCover = "" //专辑封面
    var albumHDCover = "" //专辑封面(高清)
    var albumSquareCover = "" //专辑封面(正方形)
    var albumRectCover = "" //专辑封面(矩形)
    var albumRoundCover = "" //专辑封面(圆形)
    var albumArtist = ""     //专辑艺术家
    var albumSongCount: Long = 0      //专辑音乐数
    var albumPlayCount = 0      //专辑播放数


}
