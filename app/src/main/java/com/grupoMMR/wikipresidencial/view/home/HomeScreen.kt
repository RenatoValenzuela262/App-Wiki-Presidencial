package com.grupoMMR.wikipresidencial.view.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.grupoMMR.wikipresidencial.view.home.objeto.Candidato
import com.grupoMMR.wikipresidencial.view.home.objeto.CandidatosRepository

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = viewModel(),
    navController: NavController
) {
    val uiState by homeViewModel.uiState.collectAsStateWithLifecycle()

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),

            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                style = MaterialTheme.typography.titleLarge,
                text = "Candidatos 2025"
            )
            Spacer(modifier = Modifier.height(16.dp))

            val miLista = CandidatosRepository.listaCandidatos
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(miLista) { candidato ->
                    CandidatoItem(candidato = candidato)
                }
            }
        }
    }
}

@Composable
fun CandidatoItem(candidato: Candidato, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth().height(250.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            val filtroEscalaGrises = ColorFilter.colorMatrix(ColorMatrix().apply { setToSaturation(0f) });

            val filtroImagen = if (candidato.nombre != "Jeannette Jara Román" && candidato.nombre != "José Antonio Kast"){
                filtroEscalaGrises;
            }else{
                null;
            }

            Image(
                painter = painterResource(id = candidato.foto),
                contentDescription = "Foto de ${candidato.nombre}",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                colorFilter = filtroImagen
            )
            Text(
                text = candidato.nombre,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(Color.Black.copy(alpha = 0.5f))
                    .padding(vertical = 8.dp)
            )
        }
    }
}
