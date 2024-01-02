package com.example.timelineapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TimelineAdapter (val postList: List<Post>?) : RecyclerView.Adapter<TimelineAdapter.MyViewHolder>(){
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profileImg = itemView.findViewById<ImageView>(R.id.profile_img)
        val postImg = itemView.findViewById<ImageView>(R.id.post_img)
        val userName = itemView.findViewById<TextView>(R.id.name_tv)
        val postTxt = itemView.findViewById<TextView>(R.id.post_tv)
        val postTime = itemView.findViewById<TextView>(R.id.time_tv)
        val postLike = itemView.findViewById<TextView>(R.id.like_tv)
        val postShare = itemView.findViewById<TextView>(R.id.share_tv)
        val postLink = itemView.findViewById<TextView>(R.id.link_tv)




        fun bind(post: Post) {
            profileImg.setImageResource(post.profileImgId)
            postImg.setImageResource(post.postImgId)
            userName.text = post.name
            postTxt.text = post.text
            postTime.text = post.time.toString()
            postLike.text = post.likeCount.toString()
            postShare.text = post.shareCount.toString()
            postLink.text = post.link
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_timeline, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = postList?.size ?:0


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val TimeLine = postList!![position]
        holder.bind(TimeLine)


    }
}