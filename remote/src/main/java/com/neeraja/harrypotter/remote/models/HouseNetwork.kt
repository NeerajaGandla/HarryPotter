package com.neeraja.harrypotter.remote.models

import com.google.gson.annotations.SerializedName

data class HouseNetwork(
        @SerializedName("id") val id : String,
        @SerializedName("name") val name : String,
        @SerializedName("mascot") val mascot : String,
        @SerializedName("headOfHouse") val headOfHouse : String,
        @SerializedName("houseGhost") val houseGhost : String,
        @SerializedName("id") val founder : String,
        @SerializedName("founder") val __v : Int,
        @SerializedName("school") val school : String,
        @SerializedName("members") val members : Array<MemberNetwork>,
        @SerializedName("values") val values: Array<String>,
        @SerializedName("colors") val colors: Array<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HouseNetwork

        if (id != other.id) return false
        if (name != other.name) return false
        if (mascot != other.mascot) return false
        if (headOfHouse != other.headOfHouse) return false
        if (houseGhost != other.houseGhost) return false
        if (founder != other.founder) return false
        if (__v != other.__v) return false
        if (school != other.school) return false
        if (!members.contentEquals(other.members)) return false
        if (!values.contentEquals(other.values)) return false
        if (!colors.contentEquals(other.colors)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + mascot.hashCode()
        result = 31 * result + headOfHouse.hashCode()
        result = 31 * result + houseGhost.hashCode()
        result = 31 * result + founder.hashCode()
        result = 31 * result + __v
        result = 31 * result + school.hashCode()
        result = 31 * result + members.contentHashCode()
        result = 31 * result + values.contentHashCode()
        result = 31 * result + colors.contentHashCode()
        return result
    }
}