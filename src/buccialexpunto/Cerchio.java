/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexpunto;

import java.util.Objects;

/**
 *
 * @author bucci.alex
 */
public class Cerchio extends Punto {
    
    // attributi
    private Punto centro;
    private int raggio;
    
    /**
     * costruttore
     * @param raggio raggio del cerchio
     * @param x x del centro
     * @param y y del centro
     */
    public Cerchio(int raggio, int x, int y) {
        super (x, y);
        this.centro = new Punto(x, y);
        this.raggio = raggio;
    }
    
    /**
     * getter centro
     * @return centro del cerchio
     */
    public Punto getCentro() {
        return centro;
    }

    /**
     * setter centro
     * @param centro nuovo centro del cerchio
     */
    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    /**
     * getter raggio
     * @return raggio del cerchio
     */
    public int getRaggio() {
        return raggio;
    }

    /**
     * setter raggio
     * @param raggio nuovo raggio del cerchio
     */
    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }
    
    /**
     * distanza cerchi
     * @param c cerchio da comparare
     * @return distanza tra le 2 circonferenze
     */
    public double distanzaCerchi(Cerchio c) {
        double dx = this.getX() - c.getX(); 
        double dy = this.getY() - c.getY();
        double distanzaCentri = Math.sqrt(dx * dx + dy * dy);
        return distanzaCentri - (this.getRaggio() + c.getRaggio());
    }

    /**
     * distanza origine 
     * @return la distanza del cerchio dall'origine
     */
    
    public float distanzaDaOrigine(){
        return this.distanzaOrigine() - this.raggio;
    }
    
    /**
     * intersezione tra 2 cerchi
     * @param c cerchio da comparare
     * @return se i 2 cerchi si intersecano
     */
    public boolean intersezione(Cerchio c){
        return this.distanzaCerchi(c) < 0;
    }
    
    /**
     * area del cerchio
     * @return l'area del cerchio
     */
    public double areaCerchio(){
        return Math.PI * (Math.pow(this.raggio, 2));
    }

    /**
     * override del toString
     * @return attributi dell'oggetto
     */
    @Override
    public String toString() {
        return "Cerchio{" + "centro=" + centro + ", raggio=" + raggio + ", area=" + this.areaCerchio() + '}';
    }

   /**
    * override dell'equals
    * @param obj l'oggetto da comparare
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
        final Cerchio other = (Cerchio) obj;
        if (this.raggio != other.raggio) {
            return false;
        }
        return Objects.equals(this.centro, other.centro);
    }
    
    
        
}
