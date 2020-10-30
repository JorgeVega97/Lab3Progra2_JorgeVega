package bots_jorgevega_11941147;

/**
Jorge VeGA
 */
public class X {
   private String nombre;
   private double tam,bytes,pesoTot;

    public X() {
    }

    public X(String nombre, double tam, double bytes, double pesoTot) {
        this.nombre = nombre;
        this.tam = tam;
        this.bytes = bytes;
        this.pesoTot = pesoTot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    public double getBytes() {
        return bytes;
    }

    public void setBytes(double bytes) {
        this.bytes = bytes;
    }

    public double getPesoTot() {
        return pesoTot;
    }

    public void setPesoTot(double pesoTot) {
        this.pesoTot = pesoTot;
    }

    @Override
    public String toString() {
        return "bot{" + "nombre=" + nombre + ", tam=" + tam + ", bytes=" + bytes + ", pesoTot=" + pesoTot + '}';
    }
   
    
}

