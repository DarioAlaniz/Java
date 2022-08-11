package com.gps;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneradorDeDireccionesTest{

    @Test
    public void DireccionesTest(){
        GeneradorDeDirecciones direccion = new GeneradorDeDirecciones();

        assertEquals(Direccion.NORTE,direccion.decodifica(" Norte "));
        assertEquals(Direccion.DESCONOCIDO,direccion.decodifica(" hola "));
    }
}