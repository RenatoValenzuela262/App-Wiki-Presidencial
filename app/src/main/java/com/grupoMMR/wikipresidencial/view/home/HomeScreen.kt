package com.grupoMMR.wikipresidencial.view.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.grupoMMR.wikipresidencial.R
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.grupoMMR.wikipresidencial.view.home.objeto.CandidatosRepository
import com.grupoMMR.wikipresidencial.view.navigation.Candidato
import com.grupoMMR.wikipresidencial.view.navigation.CandidatoDetalle

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = viewModel(),
    navController: NavController
){
    val uiState by homeViewModel.uiState.collectAsStateWithLifecycle()

    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),

            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

            ){
            Text(
                style = MaterialTheme.typography.titleLarge,
                text = "Candidatos 2025"
            )
            Spacer(modifier = Modifier.height(16.dp))

            val miLista= CandidatosRepository.listaCandidatos;
            LazyColumn(modifier = Modifier
                .verticalScroll(rememberScrollState())) { items(miLista.size) {
                    item ->
                    com.grupoMMR.wikipresidencial.view.home.objeto.Candidato(
                        nombre = miLista[item].nombre,
                )


            }
            }
        }
    }
}

