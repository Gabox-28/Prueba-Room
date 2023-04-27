package com.example.evaluaciongabrielmayorga.Datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.evaluaciongabrielmayorga.Entidades.Administrador

@Dao
interface DaoAdministrador {

    @Query("SELECT * FROM administrador")
    suspend fun obtenerAdministrador(): MutableList<Administrador>

    @Insert
    suspend fun agregarAdministrador(administrador: Administrador)

    @Query("UPDATE Administrador SET nombre =:nombre, apellido =:apellido, nombreUsuario =:nombreUsuario, pwd =:pwd  WHERE id =:id")
    suspend fun actualizarAdministrador(id: Int, nombre: String, apellido:String, nombreUsuario: String, pwd: String)

    @Query("DELETE FROM administrador WHERE id=:id")
    suspend fun borrarAdministrador(id: Int)
}