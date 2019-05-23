package com.winecta.viewpagersample

import android.app.Activity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class ViewPagerWithFragmentsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_view_pager)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        viewPager.adapter = ColorsPagerAdapter(this)
    }
}
