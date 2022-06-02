package lesson_3

import java.lang.IndexOutOfBoundsException

interface MyList<T> {
    fun get(index: Int): T
    fun add(string: T)
    fun remove(string: T)
    fun removeAt(index: Int)
    fun size(): Int
}

class MyArrayList<T>: MyList<T> {
    var array = arrayOfNulls<Any>(10)
    var size = 0

    companion object {
        fun <R>myListOf(vararg elements: R): MyArrayList<R> {
            val list = MyArrayList<R>()
            for (elem in elements) {
                list.add(elem)
            }
            return list
        }
    }

    override fun get(index: Int): T {
        if (index in 0 until size) {
            array[index]?.let {
                return it as T
            }
        }

        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }

        array[size] = string
        size+=1
    }

    override fun remove(elem: T) {
        for ((index, string) in array.withIndex()) {
            if (string == elem) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size -= 1
        } else {
            throw IndexOutOfBoundsException()
        }
    }

    override fun size(): Int {
        return size
    }

}