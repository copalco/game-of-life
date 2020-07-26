import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import gameoflife.Column
import org.junit.jupiter.api.Test

class CellTest {
    @Test fun `dead is not alive`() {
        assertThat(Cell.dead(Column(1)), !equalTo(Cell.alive(Column(1))))
    }

    @Test fun `two dead cells with the same column are the same`() {
        assertThat(Cell.dead(Column(1)), equalTo(Cell.dead(Column(1))))
    }

    @Test fun `two dead cells with different columns differ`() {
        assertThat(Cell.dead(Column(1)), !equalTo(Cell.dead(Column(2))))
    }

    @Test fun `two alive cells with the same column are the same`() {
        assertThat(Cell.alive(Column(1)), equalTo(Cell.alive(Column(1))))
    }

    @Test fun `two alive cells with different columns differ`() {
        assertThat(Cell.alive(Column(1)), !equalTo(Cell.alive(Column(2))))
    }

    @Test fun `alive cell can die`() {
        assertThat(Cell.alive(Column(2)).dead(), equalTo(Cell.dead(Column(2))))
    }

    @Test fun `cell has no neighbors in universe with one cell`() {
        assertThat(Cell.alive(Column(1)).neighborsCoordinates(1), equalTo(emptyList()))
    }

    @Test fun `first cell has neighbour on the right in horizontal universe with at least two cells`() {
        assertThat(Cell.alive(Column(1)).neighborsCoordinates(2), equalTo(listOf(Column(2))))
    }
}
