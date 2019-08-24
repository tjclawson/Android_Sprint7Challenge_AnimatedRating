package com.example.android_sprint7challenge_animatedrating

class RatingRepo {
    companion object{
        val ratingList = mutableListOf<Rating>()
        fun createRatingList() {
            for(i in 0 until ratingNames.size) {
                ratingList.add(Rating(ratingNames[i], ratingValues[i]))
            }
        }
    }
}