package com.example.filmnerileri.Activity.Adapter


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.filmnerileri.Activity.Activity.Gerilim
import com.example.filmnerileri.Activity.Model.GerilimModel
import com.example.filmnerileri.R


class GerilimAdapter : RecyclerView.Adapter<GerilimAdapter.RecipeViewHolder>() {
    private var arrayData = ArrayList<GerilimModel>()
    private var selectedfilms = ArrayList<GerilimModel>()

    inner class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView: TextView? = null
        var imageView: ImageView? = null


        init {
            textView = view.findViewById(R.id.tv_film)
            imageView = view.findViewById(R.id.img_film)


        }
    }

    fun setData(data: ArrayList<GerilimModel>) {
        arrayData = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items, parent, false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayData.size
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = arrayData[position]
        holder.textView?.text = recipe.name
        holder.imageView?.setImageResource(recipe.imageResource)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Gerilim::class.java)
            intent.putExtra("filmname", recipe.name)
            intent.putExtra("filmimage", recipe.imageResource)

            holder.itemView.context.startActivity(intent)
        }
    }
}