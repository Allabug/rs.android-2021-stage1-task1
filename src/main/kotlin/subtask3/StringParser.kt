package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val resultList: MutableList<String> = arrayListOf()
        for (i in inputString.indices) {
            var currentChar = inputString[i]
            var subString = inputString.substring(i)
            when (currentChar) {
                '[' -> resultList.add(getString(subString, '[', ']'))
                '(' -> resultList.add(getString(subString, '(', ')'))
                '<' -> resultList.add(getString(subString, '<', '>'))
            }
        }
        return resultList.toTypedArray()
    }

    private fun getString(subString: String, openBracket: Char, closeBracket: Char): String {

        var counter = 0
        var result = ""
        val firstIndex = subString.indexOfFirst { it == openBracket }

        for (i in subString.indices) {
            if (subString[i] == openBracket) {
                counter++
            } else if (subString[i] == closeBracket) {
                counter--
            }
            if (counter == 0) {
                result = subString.substring(firstIndex, i).dropWhile { it == openBracket }
                break
            }

        }
        return result
    }
}
