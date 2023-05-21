package com.example.mytabletclassic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.mytabletclassic.R
import com.example.mytabletclassic.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = binding.root
        val navController: NavController = Navigation.findNavController(root)

        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}