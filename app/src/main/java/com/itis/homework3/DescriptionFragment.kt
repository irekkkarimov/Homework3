package com.itis.homework3

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.itis.homework3.databinding.FragmentDescriptionBinding

class DescriptionFragment : Fragment(R.layout.fragment_description) {

    var binding : FragmentDescriptionBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDescriptionBinding.bind(view)


        var cityId = arguments?.getInt("ID").toString().toInt()
        var city = CityRepository.list[cityId - 1]
        binding?.run {
            tvTitle.text = city.name
            tvCountry.text = city.country
            tvDescription.text = city.description
            Glide.with(view).load(city.url).into(ivImage)

            goBack.setOnClickListener {
                findNavController().navigate(R.id.action_descriptionFragment_to_listFragment)
            }
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}