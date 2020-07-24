import gameoflife.Universe
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UniverseTest {
    @Test fun `dead cell stays dead`() {
        val universe = Universe("O").nextGeneration()
        Assertions.assertEquals(universe, Universe("O"))
    }
}
