package com.example.androidcero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidcero.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recycler.adapter = MoviesAdapter(
            listOf(
                Movie("Title 1","url1"),
                Movie("Title 2","url2"),
                Movie("Title 3","url3"),
                Movie("Title 4","url4"),
                Movie("Title 5","url5")
            )
        )
    }
}