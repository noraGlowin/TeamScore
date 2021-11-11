package com.example.teamscore

import androidx.lifecycle.ViewModel

class TeamScore : ViewModel() {
    private var _score : Int =0
    val score : Int
        get() = _score

    fun sum1 ():Int{
        _score= _score+1
        return _score
    }

    fun subtract ():Int{
        _score=_score-2
        return _score
    }
    fun sum4 ():Int{
        _score=_score+4
        return _score
    }
}