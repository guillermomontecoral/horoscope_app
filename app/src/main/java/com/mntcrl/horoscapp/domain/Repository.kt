package com.mntcrl.horoscapp.domain

import com.mntcrl.horoscapp.data.network.response.PredictionResponse
import com.mntcrl.horoscapp.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign:String): PredictionModel?
}