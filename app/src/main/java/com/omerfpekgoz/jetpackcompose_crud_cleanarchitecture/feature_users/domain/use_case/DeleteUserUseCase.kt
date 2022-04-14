package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case

import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class DeleteUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(user: User){
        userRepository.deleteUser(user)
    }
}