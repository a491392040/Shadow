package com.tencent.shadow.sample.plugin

import android.app.Activity
import android.os.Bundle
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer

class PlayerActivity : Activity() {
    
    lateinit var player:StandardGSYVideoPlayer
    val url = "http://www.w3school.com.cn/i/movie.mp4"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)
        player = findViewById(R.id.player)

        player.setUp(url,true,"测试视频")
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }
}