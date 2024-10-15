package com.gabriel.appdecafeteria.viewmodel

import androidx.lifecycle.ViewModel
import com.gabriel.appdecafeteria.repository.ShoppingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShoppingViewModel @Inject constructor(
    private val repository: ShoppingRepository
): ViewModel() {
}