package com.example.android_sprint7challenge_animatedrating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener {
            val dialog = MyDialogFragment()
            dialog.show(supportFragmentManager, "MyDialogFragment")
        }

        text_view_name.text = "name"
        text_view_rating.text = "rating"
    }
}
