import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import gameoflife.Universe
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        assertThat(Universe(Cell.dead()).nextGeneration(), equalTo(Universe(Cell.dead())))
    }

    @Test fun `alive cell dies`() {
        assertThat(Universe(Cell.alive()).nextGeneration(), equalTo(Universe(Cell.dead())))
    }

    @Test fun `two dead cells stay dead`() {
        assertThat(
            Universe(Cell.dead(), Cell.dead()).nextGeneration(),
            equalTo(Universe(Cell.dead(), Cell.dead()))
        )
    }
}
