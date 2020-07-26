import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Cell
import org.junit.jupiter.api.Test

class CellTest {
    @Test fun `dead is not alive`() {
        assertThat(Cell.dead(), !equalTo(Cell.alive()))
    }

    @Test fun `dead cell has column`() {
        assertThat(Cell.dead(column = 1), equalTo(Cell.dead(column = 1)))
    }
}
