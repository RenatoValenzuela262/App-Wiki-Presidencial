package com.grupoMMR.wikipresidencial.view.navigation

import kotlinx.serialization.Serializable

@Serializable
object Home;

@Serializable
data class CandidatoDetalle(
    val nombre: String,
    val edad: Int,
    val lugarNacimiento: String,
    val nacionalidad: String,
    val historialPolitico: String,
    val estudios: String,
    val propuestas: String,
    val partidoPolitico: String
);

@Serializable
data class PropuestasDetalle(
    val nombre: String,
    val partidoPolitico: String,
    val propuestas: String
);