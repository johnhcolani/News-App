package com.johncolani.newsapp.di

import android.app.Application
import com.johncolani.newsapp.data.manager.LocalUserManagerImpl
import com.johncolani.newsapp.domain.manager.LocalUserManager
import com.johncolani.newsapp.domain.usecases.AppEntryUseCases
import com.johncolani.newsapp.domain.usecases.ReadAppEntry
import com.johncolani.newsapp.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    // ✅ This must be inside the AppModule object
    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}
