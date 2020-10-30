/*
Clase Unidad Cerebla
 */
package bots_jorgevega_11941147;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
Jorge Vega
 */
public class Unidad_Cerebral {
    Scanner sc = new Scanner(System.in);
    
    private String serie ="42gb5";
    private int conexionNeural=1;
    private double peso,estadoActual=100;

    public Unidad_Cerebral() {
    }

    public Unidad_Cerebral( double estadoActual, double peso) {
        this.estadoActual = estadoActual;
        this.peso = peso;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        conexionNeural=conexionNeural+1;
        this.sc = sc;
    }

    public String getSerie() {
        return serie;
    }

    public void setConexionNeural(int conexionNeural) {
        conexionNeural=conexionNeural+1;     
    }

    public double getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(int estadoActual) {
        conexionNeural=conexionNeural+1;
        this.estadoActual = estadoActual;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        conexionNeural=conexionNeural+1;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "UnidadCerebral " + ", serie=" + serie + ", conexionNeural=" + conexionNeural + ", estadoActual=" + estadoActual + ", peso=" + peso;
    }
    
    public double caminar (){
        double estadoActual1 = (estadoActual*0.05)/100;
         if (estadoActual <= 5){
            String resp = JOptionPane.showInputDialog(null, "estado en condicion baja\ndesea recargar[s/n]");
            if (resp == "s" || resp=="S"){
                estadoActual=100;
            }
        }
        return estadoActual1;
    }
    
    public double correr (){
        double estadoActual1 = (estadoActual*0.05)/100;
        if (estadoActual <= 5){
            String resp = JOptionPane.showInputDialog(null, "estado en condicion baja\ndesea recargar[s/n]");
            if (resp == "s" || resp=="S"){
                estadoActual=100;
            }
        }
        return estadoActual1;
    }
}
