package com.example.evaluaciongabrielmayorga.Datos

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.evaluaciongabrielmayorga.Entidades.Administrador
import com.example.evaluaciongabrielmayorga.Entidades.Cliente

@Database(
    entities = [Cliente::class], [Administrador::class],
    version = 1
)
abstract class DBProyecto: RoomDatabase() {
    abstract fun daoCliente(): DaoCliente

    abstract fun daoAdministrador() : DaoAdministrador

}