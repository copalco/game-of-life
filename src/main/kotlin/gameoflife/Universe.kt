package gameoflife

data class Universe(private val cell: Cell) {
    fun nextGeneration(): Universe {
        return Universe(Cell.dead())
    }
}
