package com.example.coins2.domain.use_case.get_coins

import com.example.coins2.common.Resource
import com.example.coins2.data.remote.dto.toCoin
import com.example.coins2.data.remote.dto.toCoinDetail
import com.example.coins2.domain.model.Coin
import com.example.coins2.domain.model.CoinDetail
import com.example.coins2.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase  @Inject constructor(
    private  val repository: CoinRepository
){

    operator  fun invoke(coidID : String): Flow<Resource<CoinDetail>> = flow{
        try{
            emit(Resource.Loading())
            val coin  = repository.getCoinById(coidID).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))

        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An u expected error occured"))


        }catch (e: IOException){
            emit(Resource.Error( "ERROR. No internet Connection"))

        }

    }
}