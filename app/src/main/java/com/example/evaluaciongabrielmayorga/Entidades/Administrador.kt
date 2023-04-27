package com.example.evaluaciongabrielmayorga.Entidades

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Administrador (
    @PrimaryKey val id: Int,
    val nombre: String?,
    val apellido: String?,
    val nombreUsuario: String?,
    val pwd: String?,
)