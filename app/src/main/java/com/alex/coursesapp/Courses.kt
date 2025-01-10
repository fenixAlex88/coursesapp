package com.alex.coursesapp

import androidx.annotation.DrawableRes

data class Courses(
    val rating: Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String
)

val courses = listOf(
    Courses(3.8f, "Business", R.drawable.business, "Learn to create a successful business strategy."),
    Courses(3.5f, "Crafts", R.drawable.crafts, "Master the art of handmade creations and DIY projects."),
    Courses(4.1f, "Culinary Arts", R.drawable.culinary, "Explore the world of gourmet cooking and baking."),
    Courses(1.8f, "Design", R.drawable.design, "Dive into the fundamentals of graphic and product design."),
    Courses(1.3f, "Drawing", R.drawable.drawing, "Improve your sketching and illustration skills."),
    Courses(4.4f, "Fashion", R.drawable.fashion, "Stay ahead in the fashion industry with modern techniques."),
    Courses(4.3f, "Film Production", R.drawable.film, "Learn the art of storytelling through filmmaking."),
    Courses(1.0f, "Gaming", R.drawable.gaming, "Understand game design and development from experts."),
    Courses(4.3f, "Lifestyle", R.drawable.lifestyle, "Enhance your everyday living with practical lifestyle tips."),
    Courses(3.6f, "Music", R.drawable.music, "Learn to play, compose, and appreciate music."),
    Courses(3.3f, "Painting", R.drawable.painting, "Explore creative expression through painting techniques."),
    Courses(1.7f, "Photography", R.drawable.photography, "Capture the world through your lens with professional tips."),
    Courses(2.5f, "Technology", R.drawable.tech, "Stay updated with the latest advancements in technology.")
)