/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexpunto;
import java.util.Scanner;
/**
 *
 * @author bucci.alex
 */
public class Test {
    public Test(){
        
    }
    /**
     * metodo che contiene il main del programma
     */
    public void esegui(){
        // main
        Scanner input = new Scanner(System.in);
        
        
        // distanza tra punti
        Punto p0, p1, p2;
        p0 = new Punto(0, 0);
        System.out.println("inserire le coordinate del punto 1: ");
        p1 = new Punto(input.nextInt(),input.nextInt());
        System.out.println("inserire le coordinate del punto 2: ");
        p2 = new Punto(input.nextInt(),input.nextInt());
        System.out.println("la distanza del punto p1 dall'origine è: " + p1.distanzaOrigine());
        System.out.println("la distanza del punto p2 dall'origine è: " + p2.distanzaOrigine());
        System.out.println("la distanza tra il punto 1 e il punto 0 è: " + p1.distanzaAltroPunto(p2));
        
        // quadrato
        Punto a, b, p;
        Quadrato q;
        
        System.out.println("inserire la x e la y del punto 1 del quadrato: ");
        a = new Punto(input.nextInt(), input.nextInt());
        System.out.println("inserire la x e la y del punto 2 del quadrato: ");
        b = new Punto(input.nextInt(), input.nextInt());
        q = new Quadrato(a, b);
        
        // check se i 2 punti generano un quadrato
        while (q.checkQuadrato(a, b) == false){
            System.out.println("inserire valori per un quadrato validi");
            System.out.println("inserire la x e la y del punto 1 del quadrato: ");
            a = new Punto(input.nextInt(), input.nextInt());
            System.out.println("inserire la x e la y del punto 2 del quadrato: ");
            b = new Punto(input.nextInt(), input.nextInt());
        }
        
        // calcolo dei valori del quadrato
        q = new Quadrato(a, b);
        q.calcolaLato();
        q.calcolaArea();
        q.calcolaPerimetro();
        System.out.println(q.toString()); // i metodi get sono implementati nella classe nel caso si volesse scrivere un output personalizzato 
        
        // creazione del punto randomico
        p = new Punto(0,0);
        // impostazione dei confini
        int confineX;
        int confineY;
        System.out.print("inserire il confine per le x: ");
        confineX = input.nextInt();
        System.out.print("inserire il confine per le y: ");
        confineY = input.nextInt();
        
        // esecuzione finchè il punto randomico si trova all'interno del quadrato
        int i = 0;
        while (q.checkPunto(p, a) == false){
            i++;
            p.muoviRandom(p, confineX, confineY);
        }
        System.out.println("il punto si trova nel punto " + p.getX() + " " + p.getY() + " (dentro il quadrato) dopo " + i + " tentativi");
        
        
        
        
    }
}
