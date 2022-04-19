package com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.presentation.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case.DeleteUserUseCase
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case.GetUserUseCase
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case.GetUsersUseCase
import com.omerfpekgoz.jetpackcompose_crud_cleanarchitecture.feature_users.domain.use_case.InsertUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val deleteUserUseCase: DeleteUserUseCase,
    getUsersUseCase: GetUsersUseCase
) : ViewModel() {

    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState> = _state

    init {
        getUsersUseCase().onEach { users ->
            _state.value = state.value.copy(
                users = users
            )
        }.launchIn(viewModelScope)
    }

    fun onEvent(event: HomeEvent) {
        when (event) {
            is HomeEvent.DeleteUser -> {
                viewModelScope.launch {
                    deleteUserUseCase(event.user)
                }
            }
        }
    }
}