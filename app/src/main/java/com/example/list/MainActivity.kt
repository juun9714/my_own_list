package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //class User (val profile: Int, val name: String, val age: String, val greet: String)
    var UserList = arrayListOf<User>(
        User(R.drawable.cat,"Jun Hee","25","안녕하세요"),
        User(R.drawable.cat,"Hyo June","27","안녕하세요"),
        User(R.drawable.cat,"Ji Yoon","26","안녕하세요"),
        User(R.drawable.cat,"So Jung","26","안녕하세요"),
    )
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        var Adapter=UserAdapter(this,UserList)
        binding.listView.adapter=Adapter
    }
}