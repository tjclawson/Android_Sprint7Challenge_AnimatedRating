package com.example.android_sprint7challenge_animatedrating

import android.content.Context
import android.graphics.drawable.Animatable
import android.util.AttributeSet
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class RatingView(context: Context, attrs: AttributeSet?): LinearLayout(context, attrs) {

    constructor(context: Context): this(context, null)

    var counter = 0
    var rating = 0
    val saveButton = Button(context)
    val enterText = EditText(context)
    val thirdImageView = ImageView(context)
    val secondImageView = ImageView(context)
    val firstImageView = ImageView(context)

    //fun animateViews()

   init {
       val imageLayoutParams = LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f)
       //val firstImageView = ImageView(context)
       firstImageView.layoutParams = imageLayoutParams
       firstImageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pausetoplay))
       firstImageView.setOnClickListener {
           rating = 1
           if (counter == 0) {
               var vector = ContextCompat.getDrawable(context, R.drawable.pausetoplay)
               firstImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter++

           } else {
               var vector = ContextCompat.getDrawable(context, R.drawable.playtopause)
               firstImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter--
           }
       }

       //val secondImageView = ImageView(context)
       secondImageView.layoutParams = imageLayoutParams
       secondImageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pausetoplay))
       secondImageView.setOnClickListener {
           rating = 2
           if (counter == 0) {
               var vector = ContextCompat.getDrawable(context, R.drawable.pausetoplay)
               firstImageView.setImageDrawable(vector)
               secondImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter++

           } else {
               var vector = ContextCompat.getDrawable(context, R.drawable.playtopause)
               firstImageView.setImageDrawable(vector)
               secondImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter--
           }
       }

       //val thirdImageView = ImageView(context)
       thirdImageView.layoutParams = imageLayoutParams
       thirdImageView.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.pausetoplay))
       thirdImageView.setOnClickListener {
           rating = 3
           if (counter == 0) {
               var vector = ContextCompat.getDrawable(context, R.drawable.pausetoplay)
               firstImageView.setImageDrawable(vector)
               secondImageView.setImageDrawable(vector)
               thirdImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter++

           } else {
               var vector = ContextCompat.getDrawable(context, R.drawable.playtopause)
               firstImageView.setImageDrawable(vector)
               secondImageView.setImageDrawable(vector)
               thirdImageView.setImageDrawable(vector)
               (vector as Animatable).start()

               counter--
           }
       }


       enterText.hint = "Enter Text Here"

       //val saveButton = Button(context)
       saveButton.text = "Save"


       addView(enterText)
       addView(firstImageView)
       addView(secondImageView)
       addView(thirdImageView)
       addView(saveButton)

   }

}