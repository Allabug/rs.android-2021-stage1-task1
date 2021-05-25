package subtask2

import jdk.nashorn.internal.objects.NativeArray.forEach

class BillCounter {

    private val fairlySplit = "bon appetit"

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result = " "
        val sum = calculateSum(bill)
        val billBen = sum / 2
        val billAnna = (sum - bill[k]) / 2

        result = if (billAnna == b || billAnna > b) {
            fairlySplit
        } else {
            (b - billAnna).toString()
        }
        return result
    }

    private fun calculateSum(bill: IntArray): Int {
        var sum = 0
        bill.forEach {
            sum += it
        }
        return sum
    }
}
