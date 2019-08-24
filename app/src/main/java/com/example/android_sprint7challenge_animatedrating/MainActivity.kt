package com.example.android_sprint7challenge_animatedrating

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_fragment.*
import kotlinx.android.synthetic.main.rating_list_item.*

class MainActivity : AppCompatActivity() {

    val dialog = MyDialogFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button_add.setOnClickListener {

            dialog.show(supportFragmentManager, "MyDialogFragment")

            RatingRepo.createRatingList()

            rating_list_view.setHasFixedSize(false)
            val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
            val adapter = RatingListAdapter(RatingRepo.ratingList)
            rating_list_view.layoutManager = manager
            rating_list_view.adapter = adapter



        }



    }
}
