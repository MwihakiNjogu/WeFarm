package com.example.wefarmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {
    lateinit var saveButton:Button
    lateinit var edtName:EditText
    lateinit var edtEmail:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val saveButton = findViewById<Button>(R.id.btnSave)
        saveButton.setOnClickListener { onSaveClicked() }
    }

    private fun onSaveClicked() {
        val nameEditText = findViewById<EditText>(R.id.edit_profile_name)
        val emailEditText = findViewById<EditText>(R.id.edit_profile_email)

        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()

        // Perform validation and save the user profile data
        if (validateInput(name, email)) {
            saveUserProfile(name, email)
            finish()
        } else {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
        }
    }

    private fun validateInput(name: String, email: String): Boolean {
        // Perform your validation logic here
        return name.isNotEmpty() && email.isNotEmpty()
    }

    private fun saveUserProfile(name: String, email: String) {
        // Save the user profile data
        // You can use SharedPreferences, a local database, or an API call to save the data
    }
}
