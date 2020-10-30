/*
Clase Extremidades Superiores
 */
package bots_jorgevega_11941147;

import java.util.Scanner;

/**
Jorge Vega
 */
public class Extremidades_Superiores {
    Scanner sc = new Scanner(System.in);
    private int extremidades, fibrosas=0;
    private double maxPeso, peso;

    public Extremidades_Superiores() {
    }

    public Extremidades_Superiores(int extremidades, double maxPeso, double peso) {
        setExtremidades(extremidades);
        this.maxPeso = maxPeso;
        this.peso = peso;
    }

    
    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        if (extremidades > 5) {
            System.out.println("Ingrese otra cantidad, el maximo es 5: ");
            int valor = sc.nextInt();
            setExtremidades(valor);
        } else {
            this.extremidades = extremidades;
        }
    }

    public double getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(double maxPeso) {
        this.maxPeso = maxPeso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ExtremidadesSuperiores" + "extremidades=" + extremidades + ", fibrosas=" + fibrosas + ", maxPeso=" + maxPeso + ", peso=" + peso;
    }
    
    public void caminar (int pasos){
        fibrosas++;
    }
    
    public void correr (int pasos){
        fibrosas= fibrosas+2;
    }
    
    
}
