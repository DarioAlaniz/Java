package com.gps;

import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class GeneradorDeDirecciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeneradorDeDirecciones implements Decodificador
{
    private List<String> direcciones;

    /**
     * Constructor for objects of class GeneradorDeDirecciones
     */
    public GeneradorDeDirecciones()
    {
        direcciones = new ArrayList<String>();
    }

    /**
     * Decodifica un string, procesando la linea (ignorando espacios, mayusculas/minusculas) de 
     * forma tal de generar una direcci�n del tipo Direccion.
     * Cuando la linea no puede ser decodificada, la direccion devuelta es desconocida.
     * 
     */
    public Direccion decodifica(String linea){
        linea = linea.trim().toUpperCase();
        for (Direccion D : Direccion.values()) {
            if(linea.equals(D.toString())){
                return D;
            }
        }
        return Direccion.DESCONOCIDO;
    }
    
}
