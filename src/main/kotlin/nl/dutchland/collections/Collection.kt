package nl.dutchland.collections

import java.util.stream.Stream

interface Collection<T> : Iterator<T> {
    fun isEmpty() : Boolean
    fun size() : Int
    fun contains(value : T) : Boolean
    fun containsAll(values : Iterator<T>) : Boolean
    fun stream() : Stream<T>

}