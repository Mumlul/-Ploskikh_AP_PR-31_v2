package com.example.ploskikhap_pr_31_02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class tree : AppCompatActivity() {
    private var number: TextView? = null
    private var answ: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tree)
        number=findViewById(R.id.tt)
        answ=findViewById(R.id.tt1)
        val txtName = intent.getStringExtra("number")
        val txtLastname = intent.getStringExtra("answ")
        number!!.setText(txtName)
        answ!!.setText(txtLastname)
    }

    fun yy(view: View) {
        val intent= Intent(this,Second::class.java)
        startActivity(intent)
    }
}