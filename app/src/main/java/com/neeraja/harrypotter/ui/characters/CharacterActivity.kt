package com.neeraja.harrypotter.ui.characters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neeraja.harrypotter.R
import dagger.android.support.DaggerAppCompatActivity

class CharacterActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)
    }
}
