package com.gps;
public interface Decodificador
{
    /**
     * Decodifica un string, procesando la linea (ignorando espacios, mayusculas/minusculas) de 
     * forma tal de generar una direcci�n del tipo Direccion.
     * Cuando la linea no puede ser decodificada, la direccion devuelta es desconocida.
     * 
     */
    Direccion decodifica(String linea);
}
