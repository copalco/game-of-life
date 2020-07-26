package gameoflife

data class Cell private constructor(private val state: State, private val column: Int) {
    companion object {
        fun dead(column: Int = 1) = Cell(State.DEAD, column)
        fun alive(column: Int = 1) = Cell(State.ALIVE, column)
    }

    private enum class State { DEAD, ALIVE }

    fun dead(): Cell {
        return Cell.dead(column = this.column)
    }
}
