package com.example.coins2.domain.repository

import com.example.coins2.data.remote.dto.CoinDetailDto
import com.example.coins2.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}