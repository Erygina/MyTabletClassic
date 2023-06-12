package com.example.mytabletclassic.ui.tablet

import android.app.DatePickerDialog
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.mytabletclassic.R
import com.example.mytabletclassic.databinding.FragmentHomeBinding
import com.example.mytabletclassic.databinding.FragmentTabletBinding
import com.example.mytabletclassic.ui.home.HomeViewModel
import java.util.Calendar

class TabletFragment : Fragment() {

    companion object {
        fun newInstance() = TabletFragment()
    }

    private lateinit var viewModel: TabletViewModel
    private var _binding: FragmentTabletBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tabletViewModel =
            ViewModelProvider(this).get(TabletViewModel::class.java)
        _binding = FragmentTabletBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextBtn.setOnClickListener {
            val navController = Navigation.findNavController(binding.root)
            navController.navigate(R.id.action_tabletFragment_to_takingTabletFragment)
        }
        binding.tabletCheckboxBtn.setOnClickListener{
            binding.creamCheckboxBtn.isChecked = false
            binding.dropsCheckboxBtn.isChecked = false
            binding.vaccineCheckboxBtn.isChecked = false
        }
        binding.creamCheckboxBtn.setOnClickListener{
            binding.tabletCheckboxBtn.isChecked = false
            binding.dropsCheckboxBtn.isChecked = false
            binding.vaccineCheckboxBtn.isChecked = false
        }
        binding.dropsCheckboxBtn.setOnClickListener{
            binding.tabletCheckboxBtn.isChecked = false
            binding.creamCheckboxBtn.isChecked = false
            binding.vaccineCheckboxBtn.isChecked = false
        }
        binding.vaccineCheckboxBtn.setOnClickListener{
            binding.tabletCheckboxBtn.isChecked = false
            binding.creamCheckboxBtn.isChecked = false
            binding.dropsCheckboxBtn.isChecked = false
        }
        var mDatePicker: DatePickerDialog
        val dateAndTime = Calendar.getInstance()
        binding.shelfLifeEditText.setOnClickListener(View.OnClickListener {
            mDatePicker = DatePickerDialog(
                requireActivity(),
                { datePicker, selectedYear, selectedMonth, selectedDay ->
                    binding.shelfLifeEditText.setText(
                        "$selectedDay.$selectedMonth.$selectedYear"
                    )
                },
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH)
            )
            mDatePicker.setTitle("Выберите дату")
            mDatePicker.show()
            false
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}