/*
Clase Unidad Central
 */
package bots_jorgevega_11941147;

import java.util.Scanner;

/**
Jorge Vega
 */
public class Unidad_Central {
    Scanner sc = new Scanner(System.in);
    private int unidades,salud;
    private double cantidadAceite,bombear;

    public Unidad_Central() {
    }

    public Unidad_Central(int unidades, int salud, double cantidadAceite, double bombear) {
        setUnidades(unidades);
        this.salud = salud;
        this.cantidadAceite = cantidadAceite;
        this.bombear = bombear;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
         if (unidades > 2) {
            System.out.println("Ingrese otra cantidad, el maximo es 2: ");
            int valor = sc.nextInt();
            setUnidades(valor);
        } else {
            this.unidades = unidades;
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public double getCantidadAceite() {
        return cantidadAceite;
    }

    public void setCantidadAceite(double cantidadAceite) {
        this.cantidadAceite = cantidadAceite;
    }

    public double getBombear() {
        return bombear;
    }

    public void setBombear(double bombear) {
        this.bombear = bombear;
    }

    @Override
    public String toString() {
        return "UnidadCentral{" + "sc=" + sc + ", unidades=" + unidades + ", salud=" + salud + ", cantidadAceite=" + cantidadAceite + ", bombear=" + bombear + '}';
    }
    
    
    public double caminar (){
        double salud1 = (salud*0.02)/100;
        return salud1;
    }
    
    public double correr (){
        double salud1 = (salud*0.04)/100;
        return salud1;
    }
}
