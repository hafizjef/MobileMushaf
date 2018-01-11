package com.hafizjef.mobilemushaf.data.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.hafizjef.mobilemushaf.BR

class Repository(repoName :String, var repoUser: String) : BaseObservable() {
    @get:Bindable
    var repoName = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.repoName)
    }
}