package com.dzikyu01.acerstoreapp

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.android.parcel.Parcelize
import java.net.URL

@Parcelize
data class Acer (
    var name: String,
    var description: String,
    @DrawableRes
    var photo: Int,
    var url: String
) : Parcelable