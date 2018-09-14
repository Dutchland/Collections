package nl.dutchland.collections

import java.util.stream.Collectors
import java.util.stream.Stream
import kotlin.collections.Collection

interface Collection<T> : Iterator<T> {
    fun isEmpty() : Boolean
    fun size() : Int
    fun contains(value : T) : Boolean
    fun containsAll(values : Iterator<T>) : Boolean
    fun stream() : Stream<T>

    fun asJavaCollection(): Collection<T> {
        return stream().collect(Collectors.toList());
    }
}