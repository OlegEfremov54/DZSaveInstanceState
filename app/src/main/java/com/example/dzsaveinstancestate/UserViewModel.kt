package com.example.dzsaveinstancestate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class UserViewModel: ViewModel() {

    val users: MutableList<User> = mutableListOf()
    val listUser: MutableLiveData<List<User>> by lazy { MutableLiveData<List<User>>(mutableListOf()) }

    init {
        listUser.value = users
    }

    fun addUser(user: User) {
        users.add(user)
    }
}