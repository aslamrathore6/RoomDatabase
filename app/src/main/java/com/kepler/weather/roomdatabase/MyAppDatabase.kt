package com.kepler.weather.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * Created by Aslam Rathore on 19-02-2020.
 */

@Database(entities = [User::class], version = 1)
abstract class MyAppDatabase : RoomDatabase() {

    abstract fun myDao(): MyDao?
}