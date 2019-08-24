package com.example.android_sprint7challenge_animatedrating

import android.content.Context
import android.graphics.drawable.Animatable
import android.graphics.drawable.AnimatedVectorDrawable
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



   init {

       saveButton.text = "Save"
       enterText.hint = "Enter Text Here"

       addView(saveButton)
       addView(enterText)

       val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RatingView)
       val starCount = typedArray.getInt(R.styleable.RatingView_starcount, 3)
       val starStart = typedArray.getInt(R.styleable.RatingView_starstart, 1)
       typedArray.recycle()

       for (i in 0 until starCount) {

           val newImage = ImageView(context)
           var vector = ContextCompat.getDrawable(context, R.drawable.one)
           newImage.setImageDrawable(vector)
           (vector as Animatable).start()
           addView(newImage)
           rating = starStart


           newImage.setOnClickListener {

               rating = i + 1
               if (counter == 0) {

                   counter++



                        for (i in 0 until rating){

                            val starstoanimate = getChildAt(i + 2 ) as ImageView
                            vector = ContextCompat.getDrawable(context, R.drawable.two)
                            starstoanimate.setImageDrawable(vector)
                            (starstoanimate.drawable as AnimatedVectorDrawable).start()

                        }

               } else {

                   counter--

                   for (i in 0 until rating){

                       val starstoanimate = getChildAt(i + 2 ) as ImageView
                       vector = ContextCompat.getDrawable(context, R.drawable.one)
                       starstoanimate.setImageDrawable(vector)
                       (starstoanimate.drawable as AnimatedVectorDrawable).start()

                   }
               }
           }
       }
   }
}