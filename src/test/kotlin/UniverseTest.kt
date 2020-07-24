import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Universe
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        assertThat(Universe("O").nextGeneration(), equalTo(Universe("O")))
    }

    @Test fun `alive cell dies`() {
        assertThat(Universe("X").nextGeneration(), equalTo(Universe("O")))
    }
}
