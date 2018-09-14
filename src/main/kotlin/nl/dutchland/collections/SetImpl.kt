package nl.dutchland.collections

import java.util.stream.Stream
import kotlin.collections.Collection

class SetImpl<T> private constructor(private var set : kotlin.collections.HashSet<T>): Set<T> {
    companion object {
        internal fun <T> asSet(collection: Collection<T>) : SetImpl<T> {
            kotlin.collections.HashSet(collection)
            return SetImpl(kotlin.collections.HashSet(collection))
        }
    }

    override val isEmpty = this.set.isEmpty()
    override val size = this.set.size

    override fun contains(value: T): Boolean {
        return this.set.contains(value)
    }

    override fun containsAll(vararg values : T): Boolean {
        return this.set.containsAll(values.toList());
    }

    override fun stream(): Stream<T> {
        return this.set.stream()
    }
}
