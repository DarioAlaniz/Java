package newTp1.rpgcolecciones;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import org.junit.Test;

public class BolsaTest {
    @Test
    public void testElementosEnLaBolsa()
    {
        Bolsa bolsa = new Bolsa("bolsa1", 20);
        Elemento elemento1 = new Elemento("piedra", 2);
        Elemento elemento2 = new Elemento("lampara", 1);
        Elemento elemento3 = new Elemento("comida", 2);
        bolsa.addElemento(elemento1);
        bolsa.addElemento(elemento2);
        bolsa.addElemento(elemento3);
        ArrayList<Elemento> elementos = new ArrayList<Elemento>();
        elementos.add(elemento3);
        elementos.add(elemento2);
        elementos.add(elemento1);

        assertEquals(elementos, bolsa.getElementosEnLaBolsa());
    }
}
