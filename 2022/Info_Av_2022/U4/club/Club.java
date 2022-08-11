import java.util.ArrayList;
/**
 * Almacena detalles de los socios del club.
 * 
 * @author (su nombre) 
 * @version (un numero de version o fecha)
 */
public class Club
{
    // Defina cualquier campo necesario aqui ...
    private ArrayList<Socio> socios;
    /**
     * Constructor para objetos de la clase Club
     */
    public Club()
    {
        // Inicialice los campos aqui ...
        socios = new ArrayList<Socio>();
    }

    /**
     * Agrega un nuevo socio a la lista de socios del club.
     * @param socio El objeto de socio a ser agregado.
     */
    public void asociar(Socio socio)
    {
        if(socio instanceof Socio){
            socios.add(socio);
        }
    }

    /**
     * @return El número de socios (objetos Socio) en el club.
     */
    public int numeroDeSocios()
    {
        return socios.size();
    }
}
