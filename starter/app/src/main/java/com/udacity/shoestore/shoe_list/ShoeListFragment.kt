package com.udacity.shoestore.shoe_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.ShoeViewModel
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.RowShoeItemBinding

class ShoeListFragment : Fragment() {

    private val shoesViewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_list, container, false)

        binding.shoeDetailFab.setOnClickListener{
            findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
        }

        shoesViewModel.shoeList.observe(viewLifecycleOwner, { shoeList ->
            shoeList.forEach { shoeItem ->
                val shoeBinding: RowShoeItemBinding = DataBindingUtil.inflate(
                    inflater, R.layout.row_shoe_item, container, false)
                shoeBinding.shoe = shoeItem
                binding.shoeItemsListLayout.addView(shoeBinding.root)
            }
        })

        return binding.root
    }
}