package com.endasan.currencytracker.model.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CurrencyDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCurrencies(currencies : List<Currency>)

    @Update
    fun updateCurrencies(currencies : List<Currency>)

    @Query("SELECT * FROM currencies")
    fun getAllCurrencies(): LiveData<List<Currency>>
}