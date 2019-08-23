package com.example.android_sprint7challenge_animatedrating

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_fragment.*

class MyDialogFragment: DialogFragment() {

    //val button_save = view?.findViewById<Button>(rating_view.saveButton)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.dialog_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rating_view.saveButton.setOnClickListener {
            var inputname = rating_view.enterText.text.toString()
            var inputrating = rating_view.rating.toString()

            if(inputname != ""){
                MainActivity().text_view_name.text = inputname
                MainActivity().text_view_rating.text = inputrating
            }

            dialog.dismiss()
        }
    }
}