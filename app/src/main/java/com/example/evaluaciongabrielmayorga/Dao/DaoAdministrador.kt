package com.example.evaluaciongabrielmayorga.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.evaluaciongabrielmayorga.Entidades.Administrador
import com.example.evaluaciongabrielmayorga.Entidades.Cliente

@Dao
interface DaoAdministrador {

    @Query("SELECT * FROM administrador")
    suspend fun obtenerAdministrador(): MutableList<Administrador>

    @Insert
    suspend fun agregarAdministrador(administrador: Administrador)

    @Query("UPDATE Administrador SET nombre =:nombre, apellidos =:apellidos, nombreUsuario =:nombreUsuario, pwd =:pwd  WHERE id =:id")
    suspend fun actualizarAdministrador(id: Int, nombre: String, apellidos:String, nombreUsuario: String, pwd: String)

    @Query("DELETE FROM administrador WHERE id=:id")
    suspend fun borrarAdministrador(id: Int)
}