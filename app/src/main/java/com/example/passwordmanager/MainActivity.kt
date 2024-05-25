package com.example.passwordmanager

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.passwordmanager.data.PasswordData
import com.example.passwordmanager.ui.theme.PasswordManagerTheme
import com.example.passwordmanager.ui.uistore.HomeScreenAddNew
import com.example.passwordmanager.ui.uistore.Homescr
import com.example.passwordmanager.ui.uistore.ManagerViewModel
import com.example.passwordmanager.ui.uistore.NoteScreen

class MainActivity : ComponentActivity() {
    private val database by lazy {
        Room.databaseBuilder(
            applicationContext,
            PasswordData::class.java,
            "password.db"
        ).build()
    }
    private val viewModel by viewModels<ManagerViewModel> (
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return ManagerViewModel(database.dao) as T
                }

            }
        }
    )
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PasswordManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    val state by viewModel.state.collectAsState()
                   val navController= rememberNavController()
                    NavHost(navController = navController, startDestination ="NotesScreen"){
                        composable("NotesScreen"){
                            NoteScreen(state = state, navController = navController , onEvents =viewModel::onEvent )
                        }
                        composable("HomeScreenAddNew"){
                            HomeScreenAddNew(state = state , navController = navController , onEvents =viewModel::onEvent )
                        }

                    }
                }
            }
        }
    }




}


