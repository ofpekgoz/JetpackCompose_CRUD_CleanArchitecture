package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.presentation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Edit : Screen("edit?userId={userId}") {
        fun passId(userId: Int?): String {
            return "edit?userId=$userId"
        }
    }
}