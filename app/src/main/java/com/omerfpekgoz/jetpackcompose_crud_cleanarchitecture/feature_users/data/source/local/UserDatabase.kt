package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.data.source.local.dao.UserDao
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase:RoomDatabase() {

    abstract val userDao:UserDao


}