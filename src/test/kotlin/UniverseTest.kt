import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import gameoflife.Universe
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
            Universe(Cell.dead(column = 1), Cell.dead(column = 1)).nextGeneration(),
            equalTo(Universe(Cell.dead(column = 1), Cell.dead(column = 1)))
        )
    }
}
