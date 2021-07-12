package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        for (i in 1..array[1]) {
            if (combinations(array[1], i) >= array[0])
                return i
        }
        return null
    }

    private fun factorial(number: Int): Long = if (number <= 1) {
        1
    } else {
        number * factorial(number - 1)
    }

    private fun combinations(value1: Int, value2: Int) =
        factorial(value1) / (factorial(value1 - value2) * factorial(value2))

}
