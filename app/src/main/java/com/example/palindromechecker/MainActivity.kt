package com.example.palindromechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.palindromechecker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button.setOnClickListener { isPalind() }
    }

    private fun isPalind() {
        val editableWord = binding.editText.text
        val final = editableWord.toString()

        if(final.isEmpty())  Toast.makeText(this, "Give an input😐",Toast.LENGTH_LONG).show()

        else {

        if ( final == final.reversed()) binding.finalText.text = getString(R.string.true_palind, final)
        else binding.finalText.text = getString(R.string.false_palind, final)
    }
}
}