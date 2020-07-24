package gameoflife

data class Universe(private val cell: String) {
    fun nextGeneration(): Universe {
        return Universe("O")
    }
}
