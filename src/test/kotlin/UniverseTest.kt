import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import gameoflife.Universe
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        assertThat(Universe(Cell.dead(column = 1)).nextGeneration(), equalTo(Universe(Cell.dead(column = 1))))
    }

    @Test fun `alive cell dies`() {
        assertThat(Universe(Cell.alive(column = 1)).nextGeneration(), equalTo(Universe(Cell.dead(column = 1))))
    }

    @Test fun `two dead cells stay dead`() {
        assertThat(
            Universe(Cell.dead(column = 1), Cell.dead(column = 2)).nextGeneration(),
            equalTo(Universe(Cell.dead(column = 1), Cell.dead(column = 2)))
        )
    }

    @Tag("wip: should fail when done")
    @Test fun `a cell surrounded by two living cells survives in next generation`() {
        assertThat(
            Universe(Cell.alive(column = 1), Cell.alive(column = 2), Cell.alive(column = 3)).nextGeneration(),
            !equalTo(Universe(Cell.dead(column = 1), Cell.alive(column = 2), Cell.dead(column = 3)))
        )
    }
}
