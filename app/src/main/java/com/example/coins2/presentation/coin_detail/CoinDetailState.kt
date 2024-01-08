package com.example.coins2.presentation.coin_detail

import com.example.coins2.domain.model.Coin
import com.example.coins2.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading : Boolean = false,
    val coin: CoinDetail? = null,
    var error : String = " Error"
)
