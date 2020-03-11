package com.kepler.weather.roomdatabase.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.kepler.weather.roomdatabase.MainActivity
import com.kepler.weather.roomdatabase.R

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), View.OnClickListener {


    private lateinit var BnAddUser: Button
    private lateinit var BnReadUser:Button
    private lateinit var BnDeleteUser:Button
    private lateinit var BnUpdateUser:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        BnAddUser = view.findViewById(R.id.bn_add_user)
        BnReadUser = view.findViewById(R.id.bn_view_user)
        BnDeleteUser = view.findViewById(R.id.bn_delete_user)
        BnUpdateUser = view.findViewById(R.id.bn_update_user)
        BnUpdateUser.setOnClickListener(this)
        BnDeleteUser.setOnClickListener(this)
        BnAddUser.setOnClickListener(this)
        BnReadUser.setOnClickListener(this)
        return view

    }

    override fun onClick(v: View?) {

        when(v!!.id) {

            R.id.bn_add_user -> MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, AddUserFramgnet()).addToBackStack(null).commit()
            R.id.bn_view_user -> MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, ReadUserFramgnet()).addToBackStack(null).commit()
            R.id.bn_delete_user -> MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, DeleteUserFragment()).addToBackStack(null).commit()
            R.id.bn_update_user -> MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,UpdateUserFragment()).addToBackStack(null).commit()
        }
    }


}
