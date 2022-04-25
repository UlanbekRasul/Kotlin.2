package com.geektech.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.geektech.kotlin2.databinding.ActivityMainBinding
import com.geektech.kotlin2.extentions.glide
import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val url = mutableListOf(
        "https://i.imgur.com/S05ousl.jpeg",
        "https://i.imgur.com/wJ17Wby.png",
        "https://i.imgur.com/lq1w8yC.jpeg",
        "https://i.imgur.com/lW5jpx1.jpeg",
        "https://i.imgur.com/RJcXQEk.jpeg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener{
            url.add(binding.editText.text.toString())
        }

        binding.btnRandom.setOnClickListener{
            val randomUrl = Random.nextInt(url.size)
            val randomElement = url[randomUrl]
            Log.e("ololo", randomElement)
            binding.imageView.glide(randomElement)
        }
    }


}