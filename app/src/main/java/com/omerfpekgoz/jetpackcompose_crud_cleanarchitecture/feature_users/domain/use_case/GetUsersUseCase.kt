package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case

import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
     operator fun invoke():Flow<List<User>>{
        return userRepository.getUsers()
    }
}