package com.johncolani.newsapp.domain.usecases

import com.johncolani.newsapp.domain.manager.LocalUserManager

class SaveAppEntry (
    private val localUserManager:LocalUserManager
){

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}