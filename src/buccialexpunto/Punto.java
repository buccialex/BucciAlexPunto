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
    protected int y;
    protected int x;
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
    public double getX(){
        return this.x;
    }
    /**
     * 
     * @return coordinata y
     */
    public double getY(){
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
    
    /**
     * override tostring
     * @return attributi dell'oggetto
     */
    @Override
    public String toString() {
        return "Punto{" + "y=" + y + ", x=" + x + '}';
    }

    /**
     * override equals
     * @param obj oggetto da comparare
     * @return se i 2 oggetti hanno stessi attributi
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto other = (Punto) obj;
        if (this.y != other.y) {
            return false;
        }
        return this.x == other.x;
    }

    
    
    
    
    
}
