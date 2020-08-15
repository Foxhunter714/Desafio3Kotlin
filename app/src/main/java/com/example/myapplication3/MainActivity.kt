package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.ciromine.ciclobike.Ciclovia
import com.example.ciromine.ciclobike.SetupCiclovias
import com.example.myapplication3.CycleAdapter
import com.example.myapplication3.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setup = SetupCiclovias()
        val setupCiclovias: MutableList<Ciclovia> = SetupCiclovias().init()
        val myAdapter = CycleAdapter(setupCiclovias)
        ciclovia_reciclerview.adapter = myAdapter

        val listOf1 = setup.getComunas()
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, listOf1)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this


    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }
}