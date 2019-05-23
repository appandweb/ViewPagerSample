package com.winecta.viewpagersample

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ColorsPagerAdapter(val context: Context) : PagerAdapter() {
    var inflater: LayoutInflater? = null

    val colors = listOf(
        Color.RED, Color.BLUE, Color.GREEN,
        Color.MAGENTA, Color.DKGRAY, Color.LTGRAY,
        Color.BLACK, Color.CYAN, Color.WHITE
    )

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as? LayoutInflater
    }

    override fun isViewFromObject(view: View?, obj: Any?): Boolean = (obj as? View) == view
    override fun getCount(): Int = colors.size
    override fun destroyItem(container: ViewGroup?, position: Int, obj: Any?) = Unit

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        val v = inflater?.inflate(R.layout.view_page, container, false) ?: View(context)

        v.setBackgroundColor(colors[position])

        (container as? ViewPager)?.addView(v)

        return v
    }
}
