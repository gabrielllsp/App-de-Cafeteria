package com.gabriel.appdecafeteria.repository

import com.gabriel.appdecafeteria.datasource.DataSource
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ShoppingRepository @Inject constructor( private val dataSource: DataSource) {
}