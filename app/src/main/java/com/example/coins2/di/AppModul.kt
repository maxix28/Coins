package com.example.coins2.di

import com.example.coins2.common.Constants
import com.example.coins2.data.remote.CoinPapricaApi
import com.example.coins2.data.repository.CoinRepositoryImpl
import com.example.coins2.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModul {

    @Provides
    @Singleton
    fun providePaprikaApi (): CoinPapricaApi{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPapricaApi::class.java)
    }
    @Provides
    @Singleton
    fun provideCoinRepository (api : CoinPapricaApi): CoinRepository{
  return  CoinRepositoryImpl( api)
}


}