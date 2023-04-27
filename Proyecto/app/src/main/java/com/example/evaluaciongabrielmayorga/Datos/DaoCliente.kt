package com.example.evaluaciongabrielmayorga.Datos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.evaluaciongabrielmayorga.Entidades.Cliente

@Dao
interface DaoCliente {
    @Insert
    suspend fun agregarCliente(cliente: Cliente)

    @Query("UPDATE cliente SET nombre =:nombre, apellidos =:apellidos, correo =:correo,nombreUsuario =:nombreUsuario, pwd =:pwd  WHERE id =:id")
    suspend fun actualizarCliente(id: Int, nombre: String,apellidos:String, correo:String,nombreUsuario: String, pwd: String)

    @Query("SELECT * FROM cliente")
    suspend fun obtenerCliente(): MutableList<Cliente>

    @Query("DELETE FROM cliente WHERE id=:id")
    suspend fun borrarCliente(id: Int)

}