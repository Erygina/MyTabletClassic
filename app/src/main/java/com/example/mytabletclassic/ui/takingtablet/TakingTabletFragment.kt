package com.example.mytabletclassic.ui.takingtablet

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.mytabletclassic.R
import com.example.mytabletclassic.databinding.FragmentTakingTabletBinding
import java.util.Calendar


class TakingTabletFragment : Fragment() {

    companion object {
        fun newInstance() = TakingTabletFragment()
    }

    private var _binding: FragmentTakingTabletBinding? = null

    private val binding get() = _binding!!
    private lateinit var viewModel: TakingTabletViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tabletViewModel =
            ViewModelProvider(this).get(TakingTabletViewModel::class.java)
        _binding = FragmentTakingTabletBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dateAndTime = Calendar.getInstance()
        var mTimePicker: TimePickerDialog

        binding.includeItemTaking.timeEditText.setOnClickListener(View.OnClickListener {
            mTimePicker = TimePickerDialog(
                activity,
                { timePicker, selectedHour, selectedMinute ->
                    binding.includeItemTaking.timeEditText.setText(
                        "$selectedHour:$selectedMinute"
                    )
                },
                dateAndTime.get(Calendar.HOUR_OF_DAY),
                dateAndTime.get(Calendar.MINUTE),
                true
            )
            mTimePicker.setTitle("Выберите время")
            mTimePicker.show()
            false
        })
        var mDatePicker: DatePickerDialog
        binding.startCourseText.setOnClickListener(View.OnClickListener {
            mDatePicker = DatePickerDialog(
                requireActivity(),
                { datePicker, selectedYear, selectedMonth, selectedDay ->
                    binding.startCourseText.setText(
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
        binding.endCoursetext.setOnClickListener(View.OnClickListener {
            mDatePicker = DatePickerDialog(
                requireActivity(),
                { datePicker, selectedYear, selectedMonth, selectedDay ->
                    binding.endCoursetext.setText(
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
        binding.backButton.setOnClickListener {
            val navController = Navigation.findNavController(binding.root)
            navController.navigate(R.id.action_takingTabletFragment_to_tabletFragment)
        }
        binding.saveButton.setOnClickListener {
            val navController = Navigation.findNavController(binding.root)
            navController.navigate(R.id.action_takingTabletFragment_to_navigation_home)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}