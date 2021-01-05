package com.example.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.zip.Inflater

class UserAdapter (val context: Context, var UserList: ArrayList<User>) : BaseAdapter()

{
    override fun getCount(): Int {
        return UserList.size
    }

    override fun getItem(position: Int): Any {
        return UserList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.list_item,null)
        val user = UserList[position]

        var profile=view.findViewById<ImageView>(R.id.iv_profile)
        var name=view.findViewById<TextView>(R.id.tv_name)
        var age=view.findViewById<TextView>(R.id.tv_age)
        var greet=view.findViewById<TextView>(R.id.tv_greet)

        profile.setImageResource(user.profile)
        name.text=user.name
        greet.text=user.greet
        age.text=user.age

        return view
    }
}