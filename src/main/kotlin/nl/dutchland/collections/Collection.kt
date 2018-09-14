package nl.dutchland.collections

import java.util.stream.Collectors
import java.util.stream.Stream
import kotlin.collections.Collection

interface Collection<T> {
    val isEmpty: Boolean
    val size: Int
    fun contains(value : T) : Boolean
    fun containsAll(vararg values : T) : Boolean
    fun stream() : Stream<T>

    fun asJavaCollection(): Collection<T> {
        return stream().collect(Collectors.toList());
    }
}