package br.com.gabrielorander.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gabrielorander.sample.databinding.ActivitySampleBinding

class SampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}