package com.example.timelineapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.timelineapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val postList:MutableList<Post> = mutableListOf()
    private lateinit var timelineAdapter: TimelineAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

    }

    private fun initRecyclerView() {
        createPostList()
        timelineAdapter = TimelineAdapter(postList)
        binding.rvPostList.adapter = timelineAdapter
    }

    private fun createPostList() {
        for (i in 1..50){
            postList.add(
                Post("Alaa Ahmed", "4 hrs .", R.string.postTxt,
                R.string.postLink,"1 share","9", R.drawable.profile_img, R.drawable.photo)
            )
        }
    }
}