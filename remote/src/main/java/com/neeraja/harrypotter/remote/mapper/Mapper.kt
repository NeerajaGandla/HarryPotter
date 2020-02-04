package com.neeraja.harrypotter.remote.mapper

interface Mapper<T, E> {

    fun from(e: E): T

    fun to(t: T): E

}