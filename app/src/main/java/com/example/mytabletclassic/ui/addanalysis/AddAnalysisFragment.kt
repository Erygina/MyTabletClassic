package com.example.mytabletclassic.ui.addanalysis

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytabletclassic.R

class AddAnalysisFragment : Fragment() {

    companion object {
        fun newInstance() = AddAnalysisFragment()
    }

    private lateinit var viewModel: AddAnalysisViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_analysis, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddAnalysisViewModel::class.java)
        // TODO: Use the ViewModel
    }

}