package com.mntcrl.horoscapp.data.providers

import com.mntcrl.horoscapp.domain.model.HoroscopeInfo
import com.mntcrl.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}