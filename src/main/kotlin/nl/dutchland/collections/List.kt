package nl.dutchland.collections

interface List<T> : Collection<T> {
    @Throws(ArrayIndexOutOfBoundsException::class)
    fun get(index : Int) : T

    @Throws(ArrayIndexOutOfBoundsException::class)
    fun getLast() : T

    @Throws(ArrayIndexOutOfBoundsException::class)
    fun getFirst() : T

    companion object {
        fun <T> asList(vararg values : T) : List<T> {
            return ListImpl.asList(values.toList())
        }

        fun <T> asList(collection: kotlin.collections.Collection<T>) : List<T> {
            return ListImpl.asList(collection)
        }
    }
}