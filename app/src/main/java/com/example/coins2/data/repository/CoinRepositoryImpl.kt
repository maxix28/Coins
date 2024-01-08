package com.example.coins2.data.repository

import com.example.coins2.data.remote.CoinPapricaApi
import com.example.coins2.data.remote.dto.CoinDetailDto
import com.example.coins2.data.remote.dto.CoinDto
import com.example.coins2.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor( private val api : CoinPapricaApi) : CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
       return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
     return  api.getCoinById(coinId)
    }
}