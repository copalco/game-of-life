package gameoflife

data class Cell private constructor(private val state: State, private val column: Int) {
    companion object {
        fun dead(column: Int = 1) = Cell(State.DEAD, column)
        fun alive() = Cell(State.ALIVE, column = -1)
    }

    private enum class State { DEAD, ALIVE }
}
