package com.mntcrl.horoscapp.ui.detail

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error:String):HoroscopeDetailState()
    data class Succes(val data:String):HoroscopeDetailState()
}