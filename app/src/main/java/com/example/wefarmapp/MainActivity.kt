package com.example.wefarmapp

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var tvWelcome: TextView
    lateinit var tvProfile: TextView
    lateinit var btnFarmer: Button
    lateinit var btnConsumer: Button
    lateinit var btnRider: Button
    lateinit var progress: ProgressDialog
    lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvWelcome = findViewById(R.id.mTvWelcome)
        tvProfile = findViewById(R.id.mTvProfile)
        btnFarmer = findViewById(R.id.BtnFarmer)
        btnConsumer = findViewById(R.id.BtnConsumer)
        btnRider = findViewById(R.id.BtnRider)
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(this,)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")

        btnFarmer.setOnClickListener {
            var farmer = Intent(this, FarmerActivity::class.java)
            startActivity(farmer)
        }
        btnConsumer.setOnClickListener {
            var consumer = Intent(this, ConsumerActivity::class.java)
            startActivity(consumer)
        }

        btnRider.setOnClickListener {
            var rider= Intent(this, RiderActivity::class.java)
            startActivity(rider)
        }
    }
}