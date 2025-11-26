/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexpunto;

/**
 *
 * @author bucci.alex
 */
public class Quadrato {
    // attributi
    private Punto a, b;
    private int perimetro;
    private double lato;
    private double area;
    
    /**
     * 
     * @param a punto 1 del quadrato
     * @param b punto 2 del quadrato
     */
    public Quadrato(Punto a,Punto b){
        this.a = a;
        this.b = b;
    }
    
    // metodi
    
    /**
     * 
     * @param a punto 1 del quadrato
     * @param b punto 2 del quadrato
     * @return true se i punti sono validi per un quadrato, altrimenti false
     */
    public boolean checkQuadrato(Punto a, Punto b){
        return a.getX() == b.getY();
    }
    /**
     * metodo per calcolare il lato del quadrato 
     */
    public void calcolaLato(){
        if (a.getX() - a.getY() < 0){
            lato = -(a.getX() - a.getY());
        } else {
        lato = a.getX() - a.getY();
        }
    }
    /**
     * metodo per calcolare il perimetro del quadrato
     */
    public void calcolaPerimetro(){
        perimetro = (int) (lato * 4);
    }
    
    /**
     * metodo per calcolare l'area del quadrato
     */
    public void calcolaArea(){
        area = lato * lato;
    }
    
    /**
     * 
     * @return il valore del lato del quadrato
     */
    public int getlato(){
        return (int) lato;
    }
    
    /**
     * 
     * @return il valore del perimetro del quadrato
     */
    public int getPerimetro(){
        return perimetro;
    }
    /**
     * 
     * @return il valore dell'area del quadrato
     */
    public double getArea(){
        return area;
    }
    /**
     * 
     * @param p punto randomico
     * @param a punto del quadrato, dato che i 2 punti hanno gli stessi valori ma invertiti è sufficente un solo punto
     * @return se il punto si trova all'interno del quadrato
     */
    public boolean checkPunto(Punto p, Punto a){
        int cMax, cMin;
        if (this.a.getX() > this.a.getY()){
            cMax = (int) this.a.getX();
            cMin = (int) this.a.getY();
        } else {
            cMax = (int) this.a.getY();
            cMin = (int) this.a.getX();
        }
        return cMax >= p.getX() && cMax >= p.getY() && cMin <= p.getX() && cMin <= p.getY();
    }
    
    /**
     * 
     * @return output di lato perimetro e area del quadrato
     */
    @Override
    public String toString() {
        return "Quadrato{" + "perimetro=" + perimetro + ", lato=" + lato + ", area=" + area + '}';
    }
    
    
    
}
