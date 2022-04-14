package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.presentation.home

import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User

sealed class HomeEvent{
    data class DeleteUser(val user:User):HomeEvent()

}
