package com.aprouxdev.kotlinmessenger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.jetbrains.annotations.Nullable

@Parcelize
class User(val uid: String, val username: String, val profileImageUrl: String?): Parcelable {
  constructor() : this("", "", "")
}