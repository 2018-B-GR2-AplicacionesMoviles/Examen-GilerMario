package com.example.mjg70.examen

import android.os.Parcel
import android.os.Parcelable


class Medicina(var nombreMed:String,
               var codigoMed:String,
               var precioMed:String,
               var observacionMed:String, var dosisMed:String) :Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombreMed)
        parcel.writeString(codigoMed)
        parcel.writeString(precioMed)
        parcel.writeString(observacionMed)
        parcel.writeString(dosisMed)
    }
    override fun toString(): String {
        return "${nombreMed}"
    }
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Medicina> {
        override fun createFromParcel(parcel: Parcel): Medicina {
            return Medicina(parcel)
        }

        override fun newArray(size: Int): Array<Medicina?> {
            return arrayOfNulls(size)
        }
    }


}