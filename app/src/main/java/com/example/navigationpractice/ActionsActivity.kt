package com.example.navigationpractice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.navigationpractice.databinding.ActivityActionsBinding

class ActionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityActionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Actions Activity"

        setupButtons()
    }

    private fun setupButtons() {
        // Write to Logcat
        binding.btnWriteToLogcat.setOnClickListener {
            Log.d("ActionsActivity", "Button clicked - Write to Logcat!")
            Toast.makeText(this, "Check Logcat for message", Toast.LENGTH_SHORT).show()
        }

        binding.btnShowToast.setOnClickListener {
            Toast.makeText(this, "This is a Toast message!", Toast.LENGTH_LONG).show()
        }

        binding.btnWriteToEditText.setOnClickListener {
            binding.editText.setText("Text written by button click!")
        }

        // Back to First Fragment
        binding.btnBackToFirstFragment.setOnClickListener {
            finish()        }
    }
}