package nl.dutchland.collections

interface Collection<T> : Iterator<T> {
    fun isEmpty() : Boolean
    fun size() : Int
    fun contains(value : T) : Boolean
    fun containsAll(values : Iterator<T>) : Boolean
}