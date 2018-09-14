package nl.dutchland.collections

import java.util.stream.Collectors

interface Set<T> : Collection<T> {
    companion object {
        fun <T> asSet(vararg values : T) : Set<T> {
            return asSet(values.toList())
        }

        fun <T> asSet(collection: kotlin.collections.Collection<T>) : Set<T> {
            return SetImpl.asSet(collection);
        }

        fun <T> asSet(collection: Collection<T>) : Set<T> {
            return SetImpl.asSet(collection.asJavaCollection());
        }
    }

    fun toJavaSet(): kotlin.collections.Set<T> {
        return stream().collect(Collectors.toSet());
    }
}