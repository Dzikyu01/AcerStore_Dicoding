package com.dzikyu01.acerstoreapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Acer (
var name: String,
var description: String,
var photo: String
) : Parcelable