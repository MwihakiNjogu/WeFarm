package com.example.wefarmapp

import android.app.ProgressDialog
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class FarmerUpload : AppCompatActivity() {
    lateinit var edtName: EditText
    lateinit var edtQuantity: EditText
    lateinit var edtPrice: EditText
    lateinit var imageView: ImageView
    lateinit var btnUpload: Button
    lateinit var progress: ProgressDialog
    val PICK_IMAGE_REQUEST=100
    lateinit var filePath: Uri
    lateinit var firebaseStore: FirebaseStorage
    lateinit var storageReference: StorageReference
    lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farmer_upload)
    }
}