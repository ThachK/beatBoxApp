package com.kimmythach.beatbox

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData

class SoundViewModel(private val beatBox: BeatBox): BaseObservable(){
    fun onButtonClicked() {
        sound?.let{
            beatBox.play(it)
        }
    }

    val title: MutableLiveData<String?> = MutableLiveData()
    var sound: Sound? = null
        set(sound){
            field = sound
            title.postValue(sound?.name)
        }
}