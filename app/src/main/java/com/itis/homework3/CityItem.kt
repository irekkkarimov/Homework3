package com.itis.homework3

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.itis.homework3.databinding.ItemCityBinding

class CityItem (
    private val binding : ItemCityBinding,
    private val glide: RequestManager
    ) : ViewHolder(binding.root) {

    private val options: RequestOptions = RequestOptions
        .diskCacheStrategyOf(DiskCacheStrategy.NONE)

    private val context: Context
        get() = itemView.context
    fun onBind(city: City) {
        binding.run {
            tvTitle.text = city.name
            tvDescription.text = city.country

            glide
                .load(city.url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.drawable.ic_launcher_foreground)
                .apply(options)
                .into(ivImage)
        }
    }
}