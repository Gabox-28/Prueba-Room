package com.example.evaluaciongabrielmayorga.Entidades

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cliente(
    @PrimaryKey val idCliente: Int,
    val nombre: String?,
    val apellido: String?,
    val correo: String?,
    val nombreUsuario: String?,
    val pwd: String?,
)