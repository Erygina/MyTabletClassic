//package com.example.mytabletclassic.ui.statistics
//
//import androidx.lifecycle.ViewModelProvider
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import com.example.mytabletclassic.R
//
//class TabletStatisticFragment : Fragment() {
//
//    companion object {
//        fun newInstance() = TabletStatisticFragment()
//    }
//
//    private lateinit var viewModel: TabletStatisticViewModel
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_tablet_statistic, container, false)
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(TabletStatisticViewModel::class.java)
//        // TODO: Use the ViewModel
//    }
//
//}
