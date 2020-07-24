package gameoflife

data class Cell private constructor(private val state: String) {
    companion object {
        fun dead() = Cell("O")
        fun alive() = Cell("X")
    }
}
