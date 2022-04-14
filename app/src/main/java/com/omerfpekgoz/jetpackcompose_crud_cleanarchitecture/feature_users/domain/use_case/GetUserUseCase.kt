package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case

import androidx.compose.foundation.lazy.rememberLazyListState
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.repository.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(id: Int): User? {
        return userRepository.getUserById(id)
    }
}