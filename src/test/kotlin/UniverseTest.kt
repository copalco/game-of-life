import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import gameoflife.Universe
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        val universe = Universe("O").nextGeneration()
        assertThat(universe, equalTo(Universe("O")))
    }
}
