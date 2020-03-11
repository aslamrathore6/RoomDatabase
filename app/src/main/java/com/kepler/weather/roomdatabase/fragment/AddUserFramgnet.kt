package com.kepler.weather.roomdatabase.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kepler.weather.roomdatabase.MainActivity
import com.kepler.weather.roomdatabase.R
import com.kepler.weather.roomdatabase.User

/**
 * A simple [Fragment] subclass.
 */
class AddUserFramgnet : Fragment() {


    private lateinit var UserId: EditText
    private lateinit var UserName:EditText
    private lateinit var UserEmail:EditText

    private lateinit var BnSave:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_user_framgnet, container, false)

        UserId = view.findViewById(R.id.txt_user_id)
        UserName = view.findViewById(R.id.txt_name)
        UserEmail = view.findViewById(R.id.txt_email)
        BnSave = view.findViewById(R.id.bn_save_user)

        BnSave.setOnClickListener {

            val userid = Integer.parseInt(UserId.text.toString())
            val username = UserName.text.toString()
            val useremail = UserEmail.text.toString()

            val user = User()

            user.id = userid
            user.email = useremail
            user.name = username

            MainActivity.myAppDatabase.myDao()!!.addUser(user)
            Toast.makeText(activity, "User add Successfull", Toast.LENGTH_SHORT).show()

            UserId.setText("")
            UserName.setText("")
            UserEmail.setText("")


        }

        return view
    }


}
