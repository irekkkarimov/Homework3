package com.itis.homework3

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.itis.homework3.databinding.ItemCityBinding

class CityItem (
    private val binding : ItemCityBinding,
    private val glide: RequestManager
    ) : ViewHolder(binding.root) {

    fun onBind(city: City) {
        binding.run {
            tvTitle.text = city.name
            tvDescription.text = city.country

            glide
                .load(city.url)
                .into(ivImage)
        }
    }
}