package gameoflife

data class Universe(private val cell: String) {
    constructor(cell: Cell) : this(cell.state)

    fun nextGeneration(): Universe {
        return Universe(Cell("O"))
    }
}
