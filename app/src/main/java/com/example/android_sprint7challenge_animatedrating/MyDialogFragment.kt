package com.example.android_sprint7challenge_animatedrating

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.android_sprint7challenge_animatedrating.RatingRepo.Companion.ratingList
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_fragment.*

class MyDialogFragment: DialogFragment() {

    var inputname = ""
    var inputrating = ""



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.dialog_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(view, savedInstanceState)

        rating_view.saveButton.setOnClickListener {
            inputname = rating_view.enterText.text.toString()
            inputrating = rating_view.rating.toString()

            ratingNames.add(inputname)
            ratingValues.add(inputrating)

            for (i in 0 until ratingList.size) {
                println(ratingList[i])
            }


            dialog.dismiss()


        }

    }
}