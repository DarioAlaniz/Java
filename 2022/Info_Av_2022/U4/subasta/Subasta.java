import java.util.ArrayList;

/**
 * Un modelo simplificado de una subasta.
 * La subasta mantiene una lista de lotes de longitud arbitraria.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
 */
public class Subasta
{
    // La lista de lotes en esta subasta.
    private ArrayList<Lote> lotes;
    // El número que se le dará al próximo lote que ingrese
    // a esta subasta.
    private int numeroDeLoteSiguiente;

    /**
     * Crea una nueva subasta.
     */
    public Subasta()
    {
        lotes = new ArrayList<Lote>();
        numeroDeLoteSiguiente = 1;
    }

    /**
     * Ingresa un nuevo lote en la subasta.
     * @param descripcion Una descripcion del lote.
     */
    public void ingresarLote(String descripcion)
    {
        lotes.add(new Lote(numeroDeLoteSiguiente, descripcion));
        numeroDeLoteSiguiente++;
    }

    /**
     * Muestra la lista completa de lotes de esta subasta.
     */
    public void mostrarLotes()
    {
        for(Lote lote : lotes) {
            System.out.println(lote.toString()); // Codigo interno
        }
    }
    
    /**
     * Ofertar para un lote.
     * Emite un mensaje que indica si una oferta es exitosa o no.
     * @param numeroDeLote EL numero de lote al que oferta.
     * @param oferente La persona que hace la oferta.
     * @param valor  El valor de la oferta.
     */
    public void ofertarPara(int numeroDeLote, Persona oferente, long valor)
    {
        Lote loteElegido = getLote(numeroDeLote);
        if(loteElegido != null) {
            boolean exito = loteElegido.ofertarPara(new Oferta(oferente, valor));
            if(exito) {
                System.out.println("La oferta para lote número " +
                                   numeroDeLote + " resultó exitosa.");
            }
            else {
                // Informa cual es la mayor oferta.
                Oferta ofertaMaxima = loteElegido.getOfertaMaxima();
                System.out.println("El lote número: " + numeroDeLote +
                                   " ya tiene una oferta de: " +
                                   ofertaMaxima.getValor());
            }
        }
    }

    /**
     * Devuelve el lote de un determinado número.
     * Devuelve null si no existe un lote con ese número.
     * @param numeroDeLote El número de lote a retornar.
     */
    public Lote getLote(int numeroDeLote)
    {
        if((numeroDeLote >= 1) && (numeroDeLote < numeroDeLoteSiguiente)) {
            // El número parece ser razonable.
            //Lote loteElegido = lotes.get(numeroDeLote - 1);
            Lote loteElegido    = null;
            boolean encontrado  = false;
            int indice = 0;
            while(!encontrado & indice < lotes.size()){
                if (lotes.get(indice).getNumero() == numeroDeLote){
                    loteElegido = lotes.get(indice);
                    encontrado  = true;
                }
                indice+=1;
            } 
            
            if(loteElegido == null) {
                // Se elimino el lote seleccionado
                System.out.println("Error: el lote " + numeroDeLote + " fue eleminado o no existe");
             }
            
            // Incluye un control confidencial para asegurar que el lote es
            // el correcto.
            // if(loteElegido.getNumero() != numeroDeLote) {
                // System.out.println("Error interno: se retorno el lote número " +
                                   // loteElegido.getNumero() +
                                   // " en lugar del número " +
                                   // numeroDeLote);
            // }
            return loteElegido;
        }
        else {
            System.out.println("El lote número: " + numeroDeLote +
                               " no existe.");
            return null;
        }
    }
    
    public void cerrar(){
        
        for (Lote l:lotes){
            String cadena = "";
            if (l.getOfertaMaxima() != null){
                //lote vendido,por tener al menos tiene una oferta
                cadena += l.aString();
                cadena += " Vendido a ";
                cadena += l.getOfertaMaxima().getOferente().getNombre();
            }
            else {
                cadena += l.aString() + " No vendido";
            }
            System.out.println(cadena);
        }
    }
    
    public ArrayList getNoVendidos(){
        ArrayList<Lote> lNoVendidos = new ArrayList<Lote>();
        for (Lote l: lotes){
            if (l.getOfertaMaxima() == null){
                //lote no vendido, por no tener al menos una oferta
                lNoVendidos.add(l);
            }
        }
        return lNoVendidos;
    }
    
    public Lote removeLote(int numeroDeLote){
        Lote lRemove = null;
        if (numeroDeLote > 0 && numeroDeLote < lotes.size()){
            //numero de lote valido
            lRemove = getLote(numeroDeLote);
            if (lRemove != null){
                //se remueve de la coleccion el lote
                int indice      = 0;
                boolean remove  = false;
                while(!remove){
                     if (lotes.get(indice).getNumero() == numeroDeLote){
                        lotes.remove(indice);
                        remove  = true;
                        }
                indice+=1;
                }
            }
        }
        return lRemove;
    }
    
}
