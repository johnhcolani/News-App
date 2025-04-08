package com.johncolani.newsapp.domain.usecases

import com.johncolani.newsapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (
    private val localUserManager:LocalUserManager
){

    suspend operator fun invoke():Flow<Boolean>{
        return localUserManager.readAppEntry()
    }
}