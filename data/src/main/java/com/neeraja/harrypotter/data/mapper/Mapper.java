package com.neeraja.harrypotter.data.mapper;

public interface Mapper<T,E> {
    T from(E obj);

    E to (T obj);
}
