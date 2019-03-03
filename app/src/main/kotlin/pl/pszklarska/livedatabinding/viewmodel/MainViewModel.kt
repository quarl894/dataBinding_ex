package pl.pszklarska.livedatabinding.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

//ViewModel justice
class MainViewModel : ViewModel() {

    private val kittyRepository = KittyRepository()

    val kittyName = MutableLiveData<String>()
    val kittyage = MutableLiveData<Int>()

    //init
    init{
       kittyRepository.receiveNewKitties {
            kittyName.postValue(it.name)
            kittyage.postValue(it.age)
        }
    }
}