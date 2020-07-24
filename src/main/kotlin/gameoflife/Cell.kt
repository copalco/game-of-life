package gameoflife

data class Cell(val state: String) {
    companion object {
        fun dead() = Cell("O")
    }
}
