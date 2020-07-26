package gameoflife

data class Cell private constructor(private val state: State, private val column: Int) {
    companion object {
        fun dead(column: Int) = Cell(State.DEAD, column)
        fun alive(column: Int) = Cell(State.ALIVE, column)
        fun dead(column: Column): Cell = dead(column.number)
    }

    private enum class State { DEAD, ALIVE }

    fun dead(): Cell = dead(column)
}
