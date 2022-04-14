package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.data.repository

import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.data.source.local.dao.UserDao
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : UserRepository {
    override fun getUsers(): Flow<List<User>> {
        return userDao.getUsers()
    }

    override suspend fun getUserById(id: Int): User? {
        return userDao.getUserById(id)
    }

    override suspend fun insertUser(user: User) {
        userDao.insertUser(user)
    }

    override suspend fun deleteUser(user: User) {
        userDao.deleteUser(user)
    }

}