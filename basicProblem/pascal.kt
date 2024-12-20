fun printPascalTriangle(rows: Int) {
    require(rows > 0) { "Number of rows must be greater than 0." }

    var prevRow = mutableListOf(1)
    println(prevRow.joinToString(" "))

    for (currentRow in 1 until rows) {
        val nextRow = mutableListOf<Int>()

        nextRow.add(1)
        for (i in 1 until currentRow) {
            val sum = prevRow[i - 1] + prevRow[i]
            nextRow.add(sum)
        }
        nextRow.add(1)

        println(nextRow.joinToString(" "))

        prevRow = nextRow
    }
}