package subtask3


class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        for(item in number){
            if (!item.isDigit()){
                return null
            }
        }
        val result = mutableListOf<String>()
        val mapOfNumbers = mutableMapOf<String, List<String>>()
        mapOfNumbers["0"] = listOf("8")
        mapOfNumbers["1"] = listOf("2", "4")
        mapOfNumbers["2"] = listOf("1", "3", "5")
        mapOfNumbers["3"] = listOf("2", "6")
        mapOfNumbers["4"] = listOf("1", "5", "7")
        mapOfNumbers["5"] = listOf("2", "4", "6", "8")
        mapOfNumbers["6"] = listOf("3", "5", "9")
        mapOfNumbers["7"] = listOf("4", "8")
        mapOfNumbers["8"] = listOf("5", "7", "9", "0")
        mapOfNumbers["9"] = listOf("6", "8")

        for ((index, item) in number.withIndex()) {
            val numbers = mapOfNumbers[item.toString()]
            if (numbers != null) {
                for (item in numbers) {
                    result.add(number.substring(0, index) + item + number.substring(index + 1, number.length))
                }
            }
        }
        return result.toTypedArray()
    }
}
