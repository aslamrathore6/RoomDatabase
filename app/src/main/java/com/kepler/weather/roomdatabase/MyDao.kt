package com.kepler.weather.roomdatabase

import androidx.room.*

/**
 * Created by Aslam Rathore on 19-02-2020.
 */
@Dao
interface MyDao {

    @Insert
    fun addUser(user: User)

    @Query("select * from users")
    fun getUsers(): List<User>

    @Delete
    fun deleteUser(user:User)

    @Update
    fun updateUser(user:User)

}