package com.gps;

public abstract class PuntoInteres
{
    private String id;
    private Coordenada coordenada;

    public PuntoInteres(Coordenada c, String id)
    {
        this.id = id;
        coordenada = c;
    }

    public Coordenada getCoordenada(){
        return coordenada;
    }
    
    public abstract Tipo getTipo();
    
    public String getId(){
        return id;
    }
    
}
