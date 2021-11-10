package com.example.teamscore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.teamscore.databinding.FragmentHwBinding


class HwFragment : Fragment() {
    private val viewModel: TeamScore by viewModels()
    private lateinit var binding: FragmentHwBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View{
        // Inflate the layout for this fragment
        binding=FragmentHwBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        updateScore()
        binding.add1.setOnClickListener {
            viewModel.sum1()
            updateScore()

        }
        binding.subtract.setOnClickListener {
            viewModel.subtract()
            updateScore()

        }
        binding.add4.setOnClickListener {
            viewModel.sum4()
            updateScore()

        }

    }
    private fun updateScore() {
        binding.textScore.text = viewModel.score.toString()

    }


}