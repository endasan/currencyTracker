package com.endasan.currencytracker.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currencies")
data class Currency(
    @PrimaryKey val countryCode: String,
    @ColumnInfo(name = "value") val value: Float


)
