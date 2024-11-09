package com.example.dzsaveinstancestate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {
    val listUser: MutableLiveData<List<User>> by lazy { MutableLiveData<List<User>>() }
}