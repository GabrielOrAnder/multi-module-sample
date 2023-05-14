package br.com.gabrielorander.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.gabrielorander.feature.HomeFragment

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, HomeFragment())
            .commit()
    }
}