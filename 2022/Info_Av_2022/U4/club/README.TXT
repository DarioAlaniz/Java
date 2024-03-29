BlueJ proyecto: "club".
Autores: David J. Barnes and Michael Kolling

Este proyecto es parte del material suplementario del libro

   Programaci�n Orientada a Objetos con Java
   Una Introducci�n Pr�ctica usando BlueJ
   Third edition
   David J. Barnes and Michael Kolling
   Pearson Educacion, 2007 

Prop�sito del proyecto
======================
Este proyecto est� orientado a extender la comprensi�n de
las colecciones de objetos. Los ejercicios pueden ser abordados
despu�s de completar la secci�n 4.6 del Cap�tulo 4.

El ejercicio
============
La asociaci�n a un club es representada por una instancia de la
clase Socio. Una versi�n completa de la clase Socio se provee en
en el proyecto "club", y no deber�a necesitar modificaci�n. Cada
objeto Socio contiene los detalles del nombre de una persona, y
el mes y el a�o en la cual se asoci� al club. Todos los detalles
del socio se completan cuando se crea un objeto Socio. 

Su tarea es completar la clase Club, de la cual se suministra un
esquema en el proyecto "club".

La clase CLub esta orientada a almacenar los objetos Socio en una
colecci�n de tama�o flexible.

Un nuevo objeto Socio se agrega a un objeto clecci�n del Club via
el m�todo asociar() del club, el cual tiene la siguiente firma y
descripci�n:

    /**
     * Agrega un nuevo socio a la colecci�n de socios del club.
     * @param socio El objeto Socio a ser agregado.
     */
    public void asociar(Socio socio)

Puede suponer que el objeto Socio pasado como un par�metro ya 
ha sido creado y esta completamente inicializado.

La clase Club incluso define un m�todo para retornar cuantos
socios hay en el club. Tiene la siguiente firma y descripci�n:

    /**
     * @return El n�mero de miembros(Socio objects) en
     *         el club.
     */
    public int numeroDeSocios()

El n�mero de socios corresponde al n�mero de objetos Socio 
actualmente almacenados en la colecci�n de tama�o flexible.

Definici�n completa de la clase. Deber�a incluir:

    + Un campo para referirse a un objeto de una colecci�n 
      de tama�o flexible.

    + Un constructor sin argumentos que establezca un objeto
      apropiado de colecci�n de tama�o flexible para almacenar
      los objetos de Socio.

    + Una definici�n completa del m�todo de asociar.

    + Una definici�n completa del m�todo numeroDeObjetos.

M�s abajo hay posteriores ejercicios desafiantes para aquellos que
quieran experimentar con cuestiones adicionales de las colecciones.

Posible implementaci�n en etapas 
================================
Esta tarea ha sido dividida en etapas separadas sugeridas para
ayudarlo a crea la versi�n terminada en peque�os pasos. Se le
recomienda compilar y ejecutar el programa despu�s de cada etapa
para verificar que los cambios que ha hecho son correctos. 

1. Defina un campo que ser� usado para referirse a un objeto
colecci�n de tama�o flexible. Use una sentencia apropiada para
importar esta colecci�n. En el constructor, cree el objeto 
colecci�n y as�gnelo al campo.

2. Complete el m�todo numeroDeMiembros para retornar el tama�o
actual del objeto colecci�n. Por cierto que hasta que complete
el m�todo asociar, este siempre retornar� cero, pero estar� listo
para posteriores pruebas cuendo el m�todo asociar est� listo.

3. Complete el m�todo asociar.

Cuando quiera agregar un nuevo objeto Socio al objeto Club desde
el banco de objetos, hay dos formas en las que puede hacerlo:

    + Creee un nuevo objeto Socio en el banco de objetos, llame
    al metodo asociar del objeto Club, y haga clik en el objeto
    Socio para suministrar el par�metro.
    
    + O llame al m�todo asociar en el objeto Club y escriba:

    new Socio("ponga aqui los nombres de los socios ...", numero-de-mes-aqui, numero-de-a�o-aqui)

    en el par�metro de la caja de di�logo del constructor.

Cuando haya agregado un nuevo socio use el m�todo numeroDeSocios
para verificar: a) Que el m�todo asociar esta agregando a la 
colecci�n y b) Que el m�todo numeroDeSicios est� funcionando.

Ejercicio desafiantes
=====================
Estos ejercicios deafiantes est�n dise�ados para llevar 
el projecto club a una aplicaci�n completa. Se pueden realizar
luego de haber completado la Secci�n 4.9 del Cap�tulo 4.

+ defina un m�todo en la clase Club con la siguiente firma y 
descripci�n:

    /** 
     * Retorna cuantos socios se asociaro en un mes dado. 
     * @param mes El mes en el cual se tiene inter�s. 
     * @return Cuantos socios se asociaron en el mes dado. 
     */
    public int asociadosEnElMes(int mes) 

Si el par�metro est� fuera del rango v�lido de 1-12, imprima
un mensaje de error y retorne cero.

+ Defina un m�todo en la clase Club con la siguiente firma y 
descripcci�n:

    /**
     * Remove from the club's collection all members who joined
     * in the given month, and return them stored in a separate
     * collection object.
     * @param month The month of the Membership.
     * @param year The year of the Membership.
     */
    public ArrayList purge(int month, int year)

If the month parameter is outside the valid range of 1-12,
print an error message and return a collection object with no
objects stored in it.

Note: the purge method is significantly harder to write than
any of the others.
