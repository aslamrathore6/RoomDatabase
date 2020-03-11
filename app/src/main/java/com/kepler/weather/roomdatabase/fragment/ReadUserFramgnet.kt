package com.kepler.weather.roomdatabase.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.kepler.weather.roomdatabase.MainActivity
import com.kepler.weather.roomdatabase.R
import com.kepler.weather.roomdatabase.User

/**
 * A simple [Fragment] subclass.
 */
class ReadUserFramgnet : Fragment() {

    private lateinit var TxtInfo: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_read_user_framgnet, container, false)

        TxtInfo = view.findViewById(R.id.txt_display_information)

        val users = MainActivity.myAppDatabase.myDao()!!.getUsers()


        var info = ""

        for (usr: User in users) {
            val id = usr.id
            val name = usr.name
            val email = usr.email

            info = "$info\n\nid :$id\n Name :$name\n Email :$email"
        }

        TxtInfo.text = info

        return view
    }


}
