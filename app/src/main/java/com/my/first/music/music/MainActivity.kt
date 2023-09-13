package com.my.first.music.music

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.my.first.music.music.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Music)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.shuffleBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, PlayerActivity::class.java)
            startActivity(intent)
        }
        binding.favouriteBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, FavouriteActivity::class.java)
            startActivity(intent)
        }




        binding.PlaylistBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, playlistActivity::class.java)
            startActivity(intent)
        }

    }
}