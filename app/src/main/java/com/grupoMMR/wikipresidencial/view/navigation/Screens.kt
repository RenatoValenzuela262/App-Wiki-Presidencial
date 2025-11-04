package com.grupoMMR.wikipresidencial.core.navigation

import kotlinx.serialization.Serializable

@Serializable
data object Candidato;

@Serializable
data class CandidatoDetalle(
    val nombre: String,
    val edad: Int,
    val lugarNacimiento: String,
    val nacionalidad: String,
    val historialPolitico: String,
    val estudios: String,
    val propuestas: String,
    val partidoPolitico: String);