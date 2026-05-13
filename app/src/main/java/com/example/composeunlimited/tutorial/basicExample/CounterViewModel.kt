package com.example.composeunlimited.tutorial.basicExample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CounterViewModel: ViewModel() {
    private var _state: MutableStateFlow<Int> = MutableStateFlow(5)
    val state: StateFlow<Int> =_state

    fun increase(){
        viewModelScope.launch {
            _state.emit(state.value+1)
        }
    }

    fun decrease(){
        viewModelScope.launch {
            _state.emit(state.value-1)
        }
    }
}