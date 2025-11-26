/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexpunto;

/**
 *
 * @author bucci.alex
 */
public class Cerchio extends Punto {

    private Punto centro;
    private int raggio;

    public Cerchio(int raggio, int x, int y) {
        super (x, y);
        this.centro = new Punto(x, y);
        this.raggio = raggio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        this.raggio = raggio;
    }
    
    public double distanzaCerchi(Cerchio c){
        return Math.sqrt((Math.pow((this.getX()-this.getRaggio()), 2) + (Math.pow((c.getX()-c.getRaggio()), 2))) - (this.getRaggio() + c.getRaggio()));
    }
    
    public float distanzaDaOrigine(){
        return this.distanzaOrigine() - this.raggio;
    }
}
