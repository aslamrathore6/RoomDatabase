package com.kepler.weather.roomdatabase

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.room.Room
import com.kepler.weather.roomdatabase.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

        companion object {
            lateinit var fragmentManager: FragmentManager
            lateinit var myAppDatabase:MyAppDatabase
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAppDatabase = Room.databaseBuilder(applicationContext, MyAppDatabase::class.java, "userdb").allowMainThreadQueries().build()


        MainActivity.fragmentManager = supportFragmentManager

        if (findViewById<FrameLayout>(R.id.fragment_container) != null) {

            if (savedInstanceState != null) {
                return
            }
            MainActivity.fragmentManager.beginTransaction().add(R.id.fragment_container,
                HomeFragment()
            ).commit()
        }
    }


}
