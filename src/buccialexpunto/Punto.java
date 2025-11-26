/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexpunto;
import java.util.Random;
/**
 *
 * @author bucci.alex
 */
public class Punto {
    private int y;
    private int x;
    /**
     * 
     * @param x coordinata x del punto
     * @param y coordinata y del punto
     */
    public Punto(int x, int y){
        // uso this per riferirmi all'attributo dell'oggetto 
        this.x = x;
        this.y = y;
    }
    
    // metodi
    
    /**
     * 
     * @return valore della distanza dall'origine
     */
    public float distanzaOrigine(){
        return (float) Math.sqrt(Math.pow(x,2)+(Math.pow(y, 2)));
    }
    /**
     * 
     * @return coordinata X
     */
    public int getX(){
        return this.x;
    }
    /**
     * 
     * @return coordinata y
     */
    public int getY(){
        return this.y;
    }
    /**
     * 
     * @param p punto
     * @return distanza tra i 2 punti
     */
    public float distanzaAltroPunto(Punto p){
        return (float) Math.sqrt((Math.pow(y - p.getY(), 2))+Math.pow(x - p.getX(),2));
    }
    /**
     * 
     * @param x nuova coordinata X
     * @param y nuova coordinata Y
     */
    public void sposta(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * 
     * @param p punto da spostare
     * @param confineX confine della coordinata X
     * @param confineY confine della coordinata Y
     */
    public void muoviRandom(Punto p,int confineX, int confineY){
        Random random = new Random();
        p.sposta(random.nextInt(0, confineX), random.nextInt(0, confineY));
    }

    

    
    
    
}
