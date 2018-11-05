package com.example.kotlinannotation.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kotlinannotation.R
import com.example.kotlinannotation.annotation.*
import com.example.kotlinannotation.model.IntCustomMoel
import com.example.kotlinannotation.model.Model
import com.example.kotlinannotation.model.StringCustomMoel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = ArrayList<IntCustomMoel<Model>>()
        list.add(IntCustomMoel(FAILED, Model("垂髫稚童")))
        list.add(IntCustomMoel(SUCCESS, Model("豆蔻年华")))
        list.add(IntCustomMoel(NO_NETWORK, Model("绝代风华")))
        for (item in list) {
            when (item.status) {
                FAILED -> { }
                SUCCESS -> { }
                NO_NETWORK -> { }
            }
        }

        val stringList = ArrayList<StringCustomMoel<Model>>()
        stringList.add(StringCustomMoel(NORMAL, Model("垂髫稚童")))
        stringList.add(StringCustomMoel(GOOD, Model("豆蔻年华")))
        stringList.add(StringCustomMoel(EXCELLENT, Model("绝代风华")))
        for (item in stringList) {
            when (item.status) {
                NORMAL -> { }
                GOOD -> { }
                EXCELLENT -> { }
            }
        }


    }
}
