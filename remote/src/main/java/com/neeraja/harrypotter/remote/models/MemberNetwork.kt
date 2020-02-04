package com.neeraja.harrypotter.remote.models

import com.google.gson.annotations.SerializedName

data class MemberNetwork (@SerializedName("name") val name : String,
                          @SerializedName("id") val id : String)