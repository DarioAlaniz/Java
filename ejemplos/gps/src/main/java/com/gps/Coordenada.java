package com.gps;
/**
 * Write a description of class Coordenada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coordenada
{
    private int x;
    private int y;

    /**
     * Constructor for objects of class Coordenada
     */
    public Coordenada(int posX, int posY)
    {
        x = posX;
        y = posY;
    }
    
    public void setPosicionX(int posX)
    {
        x = posX;
    }
    
    public void setPosicionY(int posY)
    {
        y = posY;
    }
    
    public int getPosicionX(){
        return x;
    }
    
    public int getPosicionY(){
        return y;
    }
}
