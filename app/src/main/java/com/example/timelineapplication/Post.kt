package com.example.timelineapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Post(val name: String, val time: String, val text: Int, val link: Int, val shareCount: String, val likeCount: String, val profileImgId: Int, val postImgId: Int): Parcelable