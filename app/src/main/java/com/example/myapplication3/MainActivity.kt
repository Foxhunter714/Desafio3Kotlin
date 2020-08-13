package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias
import com.example.myapplication3.CycleAdapter
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setupCiclovias: MutableList<Ciclovia> = SetupCiclovias().init()
        val myAdapter = CycleAdapter(setupCiclovias)
        ciclovia_reciclerview.adapter = myAdapter
    }
}