package nl.dutchland.collections

import java.util.stream.Stream
import kotlin.collections.Collection

class SetImpl<T> private constructor(private var list : kotlin.collections.List<T>): Set<T> {

    companion object {
        internal fun <T> asSet(collection: Collection<T>) : SetImpl<T> {
            return SetImpl(ArrayList(collection))
        }
    }

    override fun isEmpty(): Boolean {
        return this.size() == 0
    }

    override fun size(): Int {
        return this.list.size
    }

    override fun contains(value: T): Boolean {
        return this.list.contains(value)
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

    override fun stream(): Stream<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
