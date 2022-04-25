package com.geektech.kotlin2.extentions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.glide(glide: String){
    Glide.with(this)
        .load(glide)
        .into(this)
}