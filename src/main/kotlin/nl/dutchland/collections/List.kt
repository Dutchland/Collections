package nl.dutchland.collections

interface List<T> : Collection<T> {
    @Throws(ArrayIndexOutOfBoundsException::class)
    fun get(index : Int) : T

    @Throws(ArrayIndexOutOfBoundsException::class)
    fun getLast() : T

    @Throws(ArrayIndexOutOfBoundsException::class)
    fun getFirst() : T
}