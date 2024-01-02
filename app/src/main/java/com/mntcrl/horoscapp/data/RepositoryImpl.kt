package com.mntcrl.horoscapp.data

import android.util.Log
import com.mntcrl.horoscapp.data.network.HoroscopeApiService
import com.mntcrl.horoscapp.data.network.response.PredictionResponse
import com.mntcrl.horoscapp.domain.Repository
import com.mntcrl.horoscapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService:HoroscopeApiService) :Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        //Forma de ejecutar una tarea
        kotlin.runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Guille", "Ha ocurrido un erros ${it.message}") }

        return null
    }
}