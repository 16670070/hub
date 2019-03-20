package com.yuda.myapplication
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
    private val pages = listOf(
        FirstFragment(), SecondFragment(), ThirdFragment(), FourthFragmen ()
    )
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Profile"
            1 -> "Hoby"
            2 -> "Sekolah"
            else -> "Cita-Cita"
        }
    }
}


