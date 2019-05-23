package com.winecta.viewpagersample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)

        button1.setOnClickListener { navigateToViewPagerScreen() }
        button2.setOnClickListener { navigateToViewPagerWithFragmentsScreen() }
    }

    private fun navigateToViewPagerScreen() =
        startActivity(Intent(this, ViewPagerActivity::class.java))

    private fun navigateToViewPagerWithFragmentsScreen() =
        startActivity(Intent(this, ViewPagerWithFragmentsActivity::class.java))
}
