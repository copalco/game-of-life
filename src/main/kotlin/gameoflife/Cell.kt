package gameoflife

data class Cell private constructor(private val state: State, private val column: Column) {
    companion object {
        fun dead(column: Int) = dead(Column(column))
        fun alive(column: Int) = alive(Column(column))
        fun dead(column: Column): Cell = Cell(State.DEAD, column)
        fun alive(column: Column): Cell = Cell(State.ALIVE, column)
    }

    private enum class State { DEAD, ALIVE }

    fun dead(): Cell = dead(column)
}
