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
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.grupoMMR.wikipresidencial.view.home.objeto.CandidatosRepository
import com.grupoMMR.wikipresidencial.view.navigation.CandidatoDetalle
import com.grupoMMR.wikipresidencial.view.navigation.PropuestasDetalle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CandidatoDetalleScreen(navController: NavHostController, backStackArgs: CandidatoDetalle) {
    val candidato = CandidatosRepository.listaCandidatos.find { it.nombre == backStackArgs.nombre }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Perfil del Candidato") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Regresar")
                    }
                }
            )
        }
    ) {
        if (candidato != null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 24.dp)
            ) {
                Spacer(modifier = Modifier.height(24.dp))
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
                Text(
                    text = candidato.nombre,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = candidato.partidoPolitico,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(32.dp))
                Text(
                    text = "Biografía",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Nacido en ${candidato.lugarNacimiento}, de nacionalidad ${candidato.nacionalidad.lowercase()}. Tiene ${candidato.edad} años.",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "Historia Política: ",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "${candidato.historialPolitico}",
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(24.dp)
                )
                Text(
                    text = "Formación Académica",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = candidato.estudios,
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick =
                        {
                            navController.navigate(
                                PropuestasDetalle(
                                    nombre = candidato.nombre,
                                    partidoPolitico = candidato.partidoPolitico,
                                    propuestas = candidato.propuestas
                                )
                            )
                        } ,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF00309f)
                    )
                ) {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Icono para acompañar al texto",
                            Modifier.padding(horizontal = 14.dp).align(Alignment.CenterStart)
                        )
                        Text(
                            text = "Ver Propuestas Clave",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                }
            }
        } else {
            Text("Candidato no encontrado", modifier = Modifier.padding(it).fillMaxSize())
        }
    }
}