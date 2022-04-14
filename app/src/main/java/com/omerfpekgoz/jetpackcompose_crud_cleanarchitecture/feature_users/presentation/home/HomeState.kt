package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.presentation.home

import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.model.User

data class HomeState(
    val users:List<User> = emptyList()
)
