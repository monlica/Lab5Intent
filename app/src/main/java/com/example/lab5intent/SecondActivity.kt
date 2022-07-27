package com.example.lab5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab5intent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        var data = intent.extras
        var newStudent:Student? = data?.getParcelable("stdData")

        bindingSecond.idText.text = "ID : ${newStudent?.id} "
        bindingSecond.nameText.text = "Name : ${newStudent?.name}"
        bindingSecond.ageText.text = "Age : ${newStudent?.age}"
        bindingSecond.hobbyText.text = "Hobby : ${newStudent?.hobby}"
    }

    fun onClickClose(view: View){
        finish()
    }
}