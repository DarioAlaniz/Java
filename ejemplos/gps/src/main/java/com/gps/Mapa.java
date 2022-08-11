package com.gps;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class Mapa
{
    // instance variables - replace the example below with your own
    private Map<String, PuntoInteres> puntos;
    private int maxX;
    private int maxY;
    private Coordenada posActual;
    private Decodificador deco;
    
    /**
     * Inicializa el mapa. 
     * Establece los limites del mapa. los valores maximos de x e y deben ser mayores o iguales a 1.
     * Establece la posicion actual en la coordenada 0,0
     * Establece el docodificador por defecto.
     * 
     */
    public Mapa (int maxX, int maxY){
        //TODO: Implementar
        
    }
    
    /**
     * Agrega un punto de Interes al Mapa.
     * 
     * @param p El punto de interes
     * @return 'false' cuando el punto es null, su Id es null o est� fuera de los limites del mapa, 
     * y 'true' si se pudo agregar el punto al mapa.
     */
    public boolean agregarPunto(PuntoInteres p){
        //TODO: Implementar
        return true;
    }
    
    /** 
     * Devuelve el cuadrado de la distancia de la posici�n actual en el mapa al punto pasado como argumento.
     * Lanza una PuntoDesconocidoException cuando el punto no est� en el mapa o su id es nulo
     * 
     * @param idPunto El ID del punto contra el cual se quiere calcular la distancia cuadrada
     * @return el cuadrado de la distancia del punto actual al punto de interes
     * @throws PuntoDesconocidoException 
     */
    
    public int getDistanciaCuadratica (String idPunto) throws PuntoDesconocidoException {
         //TODO: Implementar
         
    }
    
    /**
     * Devuelve el punto de inter�s m�s cercano a la posici�n actual, o null si no pudo encontrar ning�n punto de interes.
     * 
     * @return PuntoInteres el punto de Interpes m�s cercano
     */
    public PuntoInteres puntoMasCercano () {
        //TODO: Implementar
        }
    
    
    /**
     * Borra un punto del mapa por su id
     * 
     * @param idPunto el ID del punto que se quiere eliminar del mapa
     * @throws PuntoDesconocidoException cuando no existe el punto o el id es nulo
     */
    public void borrarPunto(String idPunto) throws PuntoDesconocidoException {
   
    }
    
    /**
     * Borra todos los puntos del mapa
     */
    public void borrarTodo (){
     
    }
    
    
    /**
     * Devuelve una lista de Puntos de Interes por Tipo
     * @param tipo El tipo de punto de interes a listar
     * @return la lista de puntos de interes
     *
     */
    public List<PuntoInteres> getPuntosDeInteresPorTipo (Tipo tipo) {
        //TODO: Implementar
    }
    
    /**
     * Devuelve la ubicaci�n actual en el mapa
     * @return la coordenada de la ubicaci�n actual
     */
    public Coordenada getUbicacion (){
        //TODO: Implementar       
    }
    
    /**
     * Establece la posicion Actual. Lanza una IllegalArgumentException cuando se setea una coordenada
     * fuera de los rangos del mapa
     * 
     * @param Coordenada la cordenada de la posicion que se quiere establece
     * @throws IllegalArgumentException cuando se setea una coordenada
     * fuera de los rangos del mapa
     * 
     */
    public void setUbicacion(Coordenada c) {
            //TODO: Implementar
    }
    
    
    /**
     * Realiza un movimiento en la posici�n actual en el mapa de acuerdo a la direcci�n pasada
     * como argumento. La direcci�n es decodificada por el decodificador actual
     * 
     * @param String la direcci�n (codificada) hacia donde moverse en el mapa
     * 
     */
    public void mover (String direccion) {
        
        Direccion dire = deco.decodifica(direccion);
        switch (dire) {
            
            case SUR:
            if (posActual.getPosicionY() > 0)
            {
                posActual.setPosicionY(posActual.getPosicionY() -1 );
            }
            break;
            
            case NORTE:
            if (posActual.getPosicionY() < maxY)
            {
                posActual.setPosicionY(posActual.getPosicionY()+1);
            } 
            break;
            
            case ESTE:
            if (posActual.getPosicionX ()> 0)
            {
                posActual.setPosicionX(posActual.getPosicionX()-1);
            }
            break;
            
            case OESTE:
            if (posActual.getPosicionX() < maxX)
            {
                posActual.setPosicionX(posActual.getPosicionX()+1);
            }
            break;
        
        }
    }
}