package gameoflife

data class Universe(private val cells: List<Cell>) {
    constructor(cell1: Cell, cell2: Cell) : this(listOf(cell1, cell2))

    constructor(cell: Cell) : this(listOf(cell))

    fun nextGeneration(): Universe {
        return Universe(cells.map { Cell.dead() })
    }
}
