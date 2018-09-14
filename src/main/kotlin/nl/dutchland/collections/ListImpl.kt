package nl.dutchland.collections

import java.util.stream.Stream
import kotlin.collections.Collection

class ListImpl<T> private constructor(private var list : kotlin.collections.List<T>) : List<T> {
    override fun stream(): Stream<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        internal fun <T> asList(collection: Collection<T>) : ListImpl<T> {
            return ListImpl(ArrayList(collection))
        }
    }

    override fun get(index: Int): T {
        if (index < 0 || index >= this.list.size) { throw ArrayIndexOutOfBoundsException() }
        return this.list.get(index);
    }

    override fun getLast(): T {
        return this.get(this.size())
    }

    override fun getFirst(): T {
        return this.get(0)
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun size(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun contains(value: T): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(values: Iterator<T>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasNext(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun next(): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}