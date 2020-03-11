package com.kepler.weather.roomdatabase.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.kepler.weather.roomdatabase.MainActivity

import com.kepler.weather.roomdatabase.R
import com.kepler.weather.roomdatabase.User

/**
 * A simple [Fragment] subclass.
 */
class DeleteUserFragment : Fragment() {

    private lateinit var TxtUserId:EditText
    private lateinit var DeleteBtn:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_delete_user, container, false)

        TxtUserId = view.findViewById(R.id.txt_user_id)
        DeleteBtn = view.findViewById(R.id.delete_btn)

        DeleteBtn.setOnClickListener {

            val id = Integer.parseInt(TxtUserId.text.toString())

            val user = User()

            user.id = id

            MainActivity.myAppDatabase.myDao()!!.deleteUser(user)

            Toast.makeText(context, "Delete User Successfull", Toast.LENGTH_SHORT).show()

            TxtUserId.setText("")


        }

        return view
    }


}
