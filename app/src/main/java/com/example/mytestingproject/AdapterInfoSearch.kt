package com.example.mytestingproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mytestingproject.databinding.ItemSearchBinding

class AdapterInfoSearch(private val listInfo: ArrayList<Model>) :
    Adapter<AdapterInfoSearch.InfoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
        return InfoViewHolder(
            ItemSearchBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
        holder.bind(listInfo[position])
    }

    override fun getItemCount() = listInfo.size
    inner class InfoViewHolder(private val binding: ItemSearchBinding) : ViewHolder(binding.root) {
        fun bind(model: Model) {
            //тут обычная привязка обьекта к model классу
            binding.btnInfo.text = model.btn_text
            binding.infoText.text = model.info
            var temp = false
            binding.btnInfo.setOnClickListener {
                //здесь через нажатие по кнопке сделали так чтобы нащ обьект изменял текст
                //чтобы она была видимой и невидимой
                //напримую обратится к visible не вышло пришлось
                //использовать класс родителя View родителя всех классов

                if (!temp) {
                    binding.infoText.visibility = View.INVISIBLE
                } else {
                    binding.infoText.visibility = View.VISIBLE
                }
                temp = !temp
            }
        }
    }
}