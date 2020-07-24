package gameoflife

data class Universe(private val cells: List<Cell>) {
    constructor(vararg cells: Cell) : this(cells.toList())

    fun nextGeneration(): Universe {
        return Universe(cells.map { Cell.dead() })
    }
}
