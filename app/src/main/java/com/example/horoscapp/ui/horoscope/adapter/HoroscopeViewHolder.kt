package com.example.horoscapp.ui.horoscope.adapter

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.horoscapp.R
import com.example.horoscapp.databinding.ItemHoroscopeBinding
import com.example.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(View: View): RecyclerView.ViewHolder(View) {

    private val binding = ItemHoroscopeBinding.bind(View)

    fun render(horoscopeInfo: HoroscopeInfo) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)
    }
}