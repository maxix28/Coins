package com.example.coins2.presentation.coin_list

import com.example.coins2.domain.model.Coin

data class CoinListState(
    val isLoading : Boolean = false,
    val coins: List<Coin> = emptyList(),
    var error : String = " Error"
)
