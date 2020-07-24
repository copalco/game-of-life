package gameoflife

data class Cell private constructor(private val state: State) {
    companion object {
        fun dead() = Cell(State.DEAD)
        fun alive() = Cell(State.ALIVE)
    }

    private enum class State { DEAD, ALIVE }
}
