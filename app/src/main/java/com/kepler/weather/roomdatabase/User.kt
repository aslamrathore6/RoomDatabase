package com.kepler.weather.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Aslam Rathore on 19-02-2020.
 */

@Entity(tableName = "users")
data class User (

        @PrimaryKey
         var id:Int = 0,

        @ColumnInfo(name = "user_name")
         var name:String? = null,

        @ColumnInfo(name = "user_email")
          var email:String? = null

)