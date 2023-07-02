package com.itis.homework3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import com.itis.homework3.databinding.FragmentListBinding

class ListFragment : Fragment(R.layout.fragment_list) {

    private var binding : FragmentListBinding? = null
    private var adapter: CityAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        initAdapter()
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun initAdapter() {
        adapter = CityAdapter(
            list = CityRepository.list,
            glide = Glide.with(this),
            onItemClick = {city ->
                Snackbar.make(binding!!.root, city.name, Snackbar.LENGTH_LONG).show()
                var bundle = Bundle()
                bundle.putInt("ID", city.id)
                findNavController().navigate(R.id.action_listFragment_to_descriptionFragment, bundle)
            }
        )
        binding?.rvCity?.adapter = adapter
    }
}