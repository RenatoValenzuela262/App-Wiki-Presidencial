package com.grupoMMR.wikipresidencial.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.rememberNavController
import com.grupoMMR.wikipresidencial.view.home.objeto.Candidato
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun NavigationWrapper(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home){
        composable<Candidato>{
            CandidatoScreen(
                navController=navController
            )
        }
        composable<CandidatoDetalle>{ backStackEntry ->
            val detalle = backStackEntry.toRoute<CandidatoDetalle>()
            CandidatoDetalleScreen(
                navController = navController,
                backStackArgs = detalle
            )
        }
    }
}
