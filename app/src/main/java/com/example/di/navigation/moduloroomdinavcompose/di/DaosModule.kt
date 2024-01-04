package com.example.di.navigation.moduloroomdinavcompose.di

import com.example.di.navigation.libdbtwo.dao.UserDao
import com.example.di.navigation.libdbtwo.datasource.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    @Singleton
    fun providesUserDao(database: AppDatabase): UserDao =database.userDao()


}