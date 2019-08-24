package com.example.android_sprint7challenge_animatedrating

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rating_list_item.view.*

class RatingListAdapter(val ratingList: MutableList<Rating>): RecyclerView.Adapter<RatingListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rating_list_item, parent, false) as View)
    }


    override fun getItemCount(): Int {
        return ratingList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rating = ratingList[position]
        holder.bindModel(rating)

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ratingNameView: TextView = view.rating_name_view
        val ratingValueView: TextView = view.rating_value_view
        val ratingItemParent: LinearLayout = view.rating_list_parent

        fun bindModel(rating: Rating) {
            ratingNameView.text = rating.listName + " "
            ratingValueView.text = rating.listRating
            ratingItemParent.setBackgroundColor(ContextCompat.getColor(itemView.context, R.color.colorPrimary))
        }
    }

}