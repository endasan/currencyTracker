package com.endasan.currencytracker.model.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Currency::class], version = 1)
abstract class DB:RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao

    companion object {
        private val dbName : String = "currency.db"
        private var dbInstance: DB? = null
        fun getInstance(context: Context): DB {
            if(dbInstance == null){
                dbInstance = Room.databaseBuilder(context,
                    DB::class.java,
                    dbName
                ).build()
            }
            return dbInstance as DB
        }
    }
}

