package newTp1.rpgcolecciones;

public class TestPersonaje 
{
  public void ejecutarTests () {
    testPersonajePrecheck();
  }
    
  public void testPersonajePrecheck() {
      // Personaje mago = new Personaje("Gandalf", 100, 60);
      // Bolsa bolsa = new Bolsa("Mochila",50);
      // mago.setBolsa(bolsa);
      // mago.setElemento(new Elemento ("Espada", 10));
      // mago.guardarElemento();
      // System.out.println(mago.getNombre() + " " + mago.getElemento());
      // mago.setElemento(new Elemento ("Hueso", 1));
      // System.out.println(mago.getNombre() + " " + mago.getElemento());
      // mago.guardarElemento();
      // System.out.println(mago.getNombre() + " " + mago.getElemento());
      // mago.tomarElemento("Espada");
      // System.out.println(mago.getNombre() + " " + mago.getElemento());
      // bolsa.addElemento(new Elemento ("Pluma", 1));
      // bolsa.addElemento(new Elemento ("Sangre", 1));
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
      System.out.println(caldero.getIngredientesFaltantes());
      System.out.println(caldero);
      caldero.prepararPocima();
      System.out.println(caldero);
      System.out.println(caldero.getPocima());

      // System.out.println("Bolsa: " + bolsa.getElementosEnLaBolsa());
      // System.out.println(caldero);
      // mago.setCaldero(caldero);
      // mago.prepararReceta(receta);
      // System.out.println("Bolsa: " + bolsa.getElementosEnLaBolsa());
      // System.out.println(caldero);
  }
      
}
