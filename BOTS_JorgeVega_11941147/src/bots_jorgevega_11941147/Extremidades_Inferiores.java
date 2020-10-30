/*
Clase Extremidades Inferiores
 */
package bots_jorgevega_11941147;

import java.util.Scanner;
/**
Jorge Vega
 */
public class Extremidades_Inferiores {
    Scanner sc = new Scanner(System.in);
    private int extremidades, fibrosas=0;
    private double velocidad, peso, levantar;

    public Extremidades_Inferiores() {
    }

    public Extremidades_Inferiores(int extremidades, double velocidad, double peso,double levantar) {
        setExtremidades(extremidades);
        this.velocidad = velocidad;
        this.peso = peso;
        this.levantar=levantar;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        if (extremidades > 10) {
            System.out.println("Ingrese otra cantidad, el maximo es 10: ");
            int valor = sc.nextInt();
            setExtremidades(valor);
        } else {
            this.extremidades = extremidades;
        }
    }

    public int getFibrosas() {
        return fibrosas;
    }

    public void setFibrosas(int fibrosas) {
        this.fibrosas = fibrosas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLevantar() {
        return levantar;
    }

    public void setLevantar(double levantar) {
        this.levantar = levantar;
    }

    @Override
    public String toString() {
        return " Extremidades Inferiores{ " + " extremidades= " + extremidades + ", fibrosas=" + fibrosas + ", velocidad=" + velocidad + ", peso=" + peso + ", levantar=" + levantar + '}';
    }
    
    
}
