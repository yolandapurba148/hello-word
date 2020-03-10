package com.example.newone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.newone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: AngkaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.
        setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProviders.of(this)
            .get(AngkaViewModel :: class.java)

        binding.angkaViewModel = viewModel
        binding.lifecycleOwner = this



    }
}
