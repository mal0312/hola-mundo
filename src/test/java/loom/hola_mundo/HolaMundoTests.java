package loom.hola_mundo;

import org.junit.Assert;
import org.junit.Test;

public class HolaMundoTests {
    @Test
    public void queSaludaCorrectamente() {
        HolaMundo holaMundo = new HolaMundo();
        Assert.assertEquals("Hola, Javier Orlando!", holaMundo.saludar("Javier Orlando"));
    }
}
