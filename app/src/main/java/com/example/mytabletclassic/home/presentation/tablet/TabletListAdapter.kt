package com.example.mytabletclassic.home.presentation.tablet

import android.app.TimePickerDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytabletclassic.R
import com.example.mytabletclassic.databinding.TabletItemBinding
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.Instant.now
import java.time.LocalTime
import java.util.Calendar

class TabletListAdapter() :
    RecyclerView.Adapter<TabletListAdapter.TabletListViewHolder>() {

    class TabletListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val viewBinding = TabletItemBinding.bind(view)

        fun bind(text: String, selectedHour: Int, selectedMinute:Int) {
            viewBinding.tabletImageView.drawable
            viewBinding.nameTextView.text = text
            viewBinding.dosageTextView.setText("$selectedHour:$selectedMinute")
            viewBinding.timeTextView.setText("$selectedHour:$selectedMinute")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabletListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_taking_tablet, parent, false)
        return TabletListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 2
    }

//    fun addItemCount(): Int {
//       return count++
//    }

    override fun onBindViewHolder(holder: TabletListViewHolder, position: Int) {
        holder.bind("Прием $position", 18,34)
    }
}