package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.isEmpty() || sadArray.size < 3) return sadArray

        var happyArray: IntArray = sadArray
        var isSad = true

        while (isSad) {
            var counter = 0
            val happyList: ArrayList<Int> = ArrayList()
            happyList.add(happyArray.first())
            for (i in 1 until happyArray.lastIndex) {
                val previous = happyArray[i - 1]
                val next = happyArray[i + 1]
                val sum = previous + next
                if (sum > happyArray[i]) {
                    happyList.add(happyArray[i])
                } else {
                    counter++
                }
            }

            happyList.add(happyArray.last())
            happyArray = happyList.toIntArray()

            if(counter == 0) {
                isSad = false
            }
        }
        return happyArray
    }
}
