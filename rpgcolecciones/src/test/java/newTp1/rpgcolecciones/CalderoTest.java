package newTp1.rpgcolecciones;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalderoTest {
    @Test
    public void testVerificarIngredientes()
    {
      Caldero caldero = new Caldero("chico", 5);
      Receta receta = new Receta("voladora");
      receta.addIngrediente("Pluma");
      receta.addIngrediente("Sangre");
      receta.addIngrediente("Hueso");
      receta.cerrarReceta();
      caldero.setReceta(receta);
      caldero.addIngrediente(new Elemento("Pluma", 2));
      caldero.addIngrediente(new Elemento("Sangre", 1));
      caldero.addIngrediente(new Elemento("Hueso", 1));
      assertEquals(true,caldero.verificarIngredientes());
    }

}
