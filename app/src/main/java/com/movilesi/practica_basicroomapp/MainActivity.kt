package com.movilesi.practica_basicroomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.movilesi.practica_basicroomapp.database.User

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        mainViewModel.saveUser(User(
//            "Userid02",
//            "name02",
//            1.72,
//            72.2,
//            "email02@gmail.com",
//            "passUser02"
//        ))

        mainViewModel.getUsers()
        mainViewModel.savedUsers.observe(this, {usersList ->
            if(!usersList.isNullOrEmpty()){
                for (user in usersList) {
                    Log.d("thesearetheUsers", user.user_name)
                }
            } else {
                Log.d("thesearetheUsers", "null or empty")
            }
        })

    }
}