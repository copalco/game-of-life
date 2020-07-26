import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import org.junit.jupiter.api.Test

class CellTest {
    @Test fun `dead is not alive`() {
        assertThat(Cell.dead(column = 1), !equalTo(Cell.alive(column = 1)))
    }

    @Test fun `two dead cells with the same column are the same`() {
        assertThat(Cell.dead(column = 1), equalTo(Cell.dead(column = 1)))
    }

    @Test fun `two dead cells with different columns differ`() {
        assertThat(Cell.dead(column = 1), !equalTo(Cell.dead(column = 2)))
    }

    @Test fun `two alive cells with the same column are the same`() {
        assertThat(Cell.alive(column = 1), equalTo(Cell.alive(column = 1)))
    }

    @Test fun `two alive cells with different columns differ`() {
        assertThat(Cell.alive(column = 1), !equalTo(Cell.alive(column = 2)))
    }
}
