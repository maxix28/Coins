package com.example.coins2.domain.model

import com.example.coins2.data.remote.dto.Team
import java.io.FileDescriptor

data class CoinDetail(
    val coinId :String,
    val name : String,
    val description : String,
    val symbol : String,
    val rank : Int,
    val isActive: Boolean,
    val tags : List<String>,
    val team : List<Team>

)
