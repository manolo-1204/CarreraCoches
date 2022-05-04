package es.manu;

public class Coche {
    private String tipo;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche() {
        tipo = "Desconocido";
        modelo = "Desconocido";
        color = "Desconocido";
        velocidad = 0;
    }

    public Coche(String tipo, String modelo, String color) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }


    public int incrementarVelocidad(int incremento) {
        velocidad += incremento;
        return velocidad;
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }

    public String getInfo() {
      return "Tipo: " + this.tipo + "\n" +
              "Modelo: " + this.modelo + "\n" ;
    }
    
    @Override
    public String toString() {
        return "COCHE:\n" +
                "Tipo: " + this.tipo + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Velocidad: " + this.velocidad + " km/h\n";
    }
}
