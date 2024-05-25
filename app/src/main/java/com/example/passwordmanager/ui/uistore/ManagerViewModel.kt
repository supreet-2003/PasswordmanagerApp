package com.example.passwordmanager.ui.uistore

import android.accounts.Account
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.LocalSaveableStateRegistry
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.passwordmanager.data.DaoPass
import com.example.passwordmanager.data.Entity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ManagerViewModel(
    private var dao:DaoPass
):ViewModel() {


    fun onEvent(event: Events){
        when(event){
            is Events.DeleteAccount -> {
                viewModelScope.launch {
                    dao.deletenote(event.note)
                }
            }
            is Events.SaveNote -> {

                val note= Entity(
                    Account = event.Account,
                    Username = event.Username,
                    Password =  event.Password
                )
                viewModelScope.launch {
                    dao.upsertnote(pass = note)
                }
                    var _state = MutableStateFlow(Homescr())

//                _state.update {
//                    it.apply {
//                        note.Account
//                    }
//                }


            }

        }
    }
}