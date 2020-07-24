import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import gameoflife.Universe
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        assertThat(Universe(Cell.dead()).nextGeneration(), equalTo(Universe(Cell("O"))))
    }

    @Test fun `alive cell dies`() {
        assertThat(Universe(Cell("X")).nextGeneration(), equalTo(Universe(Cell("O"))))
    }
}
