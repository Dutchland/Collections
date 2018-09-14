package nl.dutchland.collections

import java.util.*
import kotlin.collections.ArrayList
import kotlin.test.*

class SetImplTest {
    @Test
    fun testIsEmpty_AndSizeZero_EmptySet() {
        val emptySet = SetImpl.asSet(ArrayList<Int>())

        assertTrue { emptySet.isEmpty }
        assertEquals(0, emptySet.size)
    }

    @Test
    fun testIsEmpty_AndNonZeroSize_NonEmptySet() {
        val setWith3Records = SetImpl.asSet(Arrays.asList(1, 2, 3))

        assertFalse { setWith3Records.isEmpty }
        assertEquals(3, setWith3Records.size)
    }

    @Test
    fun testContains_Does() {
        val someSet = SetImpl.asSet(Arrays.asList(1, 2, 3, 4))

        assertTrue { someSet.contains(3) }
    }

    @Test
    fun testContains_DoesNot() {
        val setThatDoesNotContain3 = SetImpl.asSet(Arrays.asList(1, 2))

        assertFalse { setThatDoesNotContain3.contains(3) }
    }

    @Test
    fun testContainsAll_ContainsNone() {
        val setThatDoesNotContain3 = SetImpl.asSet(Arrays.asList(1, 2))

        assertFalse { setThatDoesNotContain3.containsAll(3, 4) }
    }

    @Test
    fun testContainsAll_ContainsPart() {
        val setThatDoesNotContain3 = SetImpl.asSet(Arrays.asList(1, 2))

        assertFalse { setThatDoesNotContain3.containsAll(2, 3) }
    }

    @Test
    fun testContainsAll_ContainsAll() {
        val setThatDoesNotContain3 = SetImpl.asSet(Arrays.asList(1, 2, 3))

        assertTrue { setThatDoesNotContain3.containsAll(1, 2) }
    }




    @Test
    fun testRemoveDuplicatedValued() {
        val someSet = SetImpl.asSet(Arrays.asList(1, 2, 2, 2))

        assertEquals(2, someSet.size)
        assertTrue { someSet.contains(1) }
        assertTrue { someSet.contains(2) }
    }

}