package com.grupoMMR.wikipresidencial.view.candidatodetalle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.grupoMMR.wikipresidencial.view.home.objeto.CandidatosRepository
import com.grupoMMR.wikipresidencial.view.navigation.CandidatoDetalle

@Composable
fun CandidatoDetalleScreen(navController: NavHostController, backStackArgs: CandidatoDetalle) {
    val candidato = CandidatosRepository.listaCandidatos.find { it.nombre == backStackArgs.nombre }

    Box(modifier = Modifier.fillMaxSize()) {
        if (candidato != null) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(vertical = 16.dp)
                .align(Alignment.Center))
            {
                Text(text = "Perfil del Candidato", style = MaterialTheme.typography.titleLarge, modifier = Modifier.align(Alignment.CenterHorizontally))
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 32.dp, vertical = 80.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Image(
                    painter = painterResource(id = candidato.foto),
                    contentDescription = candidato.nombre,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = candidato.nombre, style = MaterialTheme.typography.titleLarge, modifier = Modifier.align(Alignment.CenterHorizontally))
                Text(text = candidato.partidoPolitico, style = MaterialTheme.typography.titleMedium, modifier = Modifier.align(Alignment.CenterHorizontally))
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Edad: " + candidato.edad, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Lugar de Nacimiento: " + candidato.lugarNacimiento, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Nacionalidad: " + candidato.nacionalidad, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Estudios: " + candidato.estudios, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Historial politico: " + candidato.historialPolitico, style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(8.dp))
                /*
                Text(text = "Propuestas: " + candidato.propuestas, style = MaterialTheme.typography.bodyMedium)
                */
            }
        } else {
            Text("Candidato no encontrado", modifier = Modifier.align(Alignment.Center))
        }

        FloatingActionButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp),
            containerColor = Color.Blue,
            contentColor = Color.White
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Regresar"
            )
        }
    }
}