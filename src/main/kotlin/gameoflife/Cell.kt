package gameoflife

data class Cell private constructor(private val state: State, private val column: Column) {
    companion object {
        fun dead(column: Column): Cell = Cell(State.DEAD, column)
        fun alive(column: Column): Cell = Cell(State.ALIVE, column)
    }

    private enum class State { DEAD, ALIVE }

    fun dead(): Cell = dead(column)

    fun neighborsCoordinates(universeSize: Int): List<Column> {
        if (universeSize == 1) {
            return emptyList()
        }
        return listOf(Column(2))
    }
}
