package com.example.mytestingproject

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mytestingproject.databinding.FragmentBlankBinding
import java.nio.file.Files.walk

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    private var listInfo = arrayListOf<Model>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startedFragment()
        musicFragment()
        val adapter = AdapterInfoSearch(listInfo)
        binding.infoSearch.adapter = adapter
    }

    private fun musicFragment() {
        binding.musicView.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(context, R.raw.walk)
            mediaPlayer.start()
            mediaPlayer.isLooping = true
        }
    }

    private fun startedFragment() {
        listInfo.add(
            Model(
                "1.1 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.2 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.3 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.4 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.5 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.6 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.7 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.8 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
        listInfo.add(
            Model(
                "1.9 Повесть о геракле ",
                "Более тысячи лет назад измученная душа скиталась по Земле, полубог, получеловек — Геракл — могучий сын царя богов Зевса"
            )
        )
    }
}