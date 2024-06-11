package ind.gopinnath;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndividualTest {

    @Test
    public void testIndividualUsage() {
        Individual individual = new Individual(1, "Alice", "Thomas");
        assertEquals(1, individual.identifier());
        assertEquals("Alice", individual.firstName());
        assertEquals("Thomas", individual.lastName());
    }
}
