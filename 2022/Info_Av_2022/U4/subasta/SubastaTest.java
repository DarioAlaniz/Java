

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class SubastaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SubastaTest
{
    private Subasta subasta1;
    private Lote lote1;
    private Lote lote2;
    private Lote lote3;
    private Persona persona1;

    /**
     * Default constructor for test class SubastaTest
     */
    public SubastaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        subasta1 = new Subasta();
        persona1 = new Persona("nina");
        subasta1.ingresarLote("lote1");
        subasta1.ingresarLote("lote2");
        subasta1.ingresarLote("lote3");
        subasta1.ingresarLote("lote4");
        subasta1.ofertarPara(1, persona1, 40);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
