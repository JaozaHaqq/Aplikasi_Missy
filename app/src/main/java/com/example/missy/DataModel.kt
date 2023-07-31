package com.example.missy

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel(
    var image : Int = 0,
    var from : String,
    var gambar1 : String,
    var gambar2 : String,
    var sumber : String,
    var title : String,
    var desc : String
) : Parcelable