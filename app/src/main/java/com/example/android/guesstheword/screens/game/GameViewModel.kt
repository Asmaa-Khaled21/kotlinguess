package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.math.log

class GameViewModel : ViewModel() {

    init {
       Log.i("GameViewModel", "GameViewModel" )
    }

    override fun onCleared(){
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel" )
    }
}