package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return decompose(number.toLong()-1, number.toLong() * number.toLong())?.toTypedArray()
    }

    private fun decompose(number: Long, total: Long): MutableList<Int>? {
        if (total == 0L) {
            return mutableListOf()
        }
        if (number <= 0 || total < 0) {
            return null
        }
        val sub = decompose(number - 1, total - number * number)
        if (sub != null) {
            sub.add(number.toInt())
            return sub
        }
        return decompose(number - 1, total)
    }
}
