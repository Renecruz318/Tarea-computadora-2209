package Hardware.ico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rene
 */
public class Computadora {
    private String marca;
    private String modelo;
    private CPU procesador;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora(String marca, String modelo, CPU procesador,
            Monitor monitor, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

   

    public Computadora() {
        this.marca = "Arsock";
        this.modelo = "B550";
        this.procesador = new CPU();
        this.teclado = new Teclado();
        this.monitor = new Monitor();
        this.mouse = new Mouse();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    public void mostrarComputadora(){
        String[] j = {"\n\t", "\n\t\t", "\n\t\t\t", "\n\t\t\t\t"};
        int i = 0; 
        System.out.println("Especificaciones de la computadora:" + j[i] +
            "marca: " + this.marca + j[i] + "modelo: " + this.modelo + j[i]
                
            + "CPU:" +j[++i] + "marca: " + this.procesador.getMarca() + j[i] +
            "modelo: "+ this.procesador.getModelo() + "velocidad: " +
            Integer.toString(this.procesador.getVelocidadProcesador()) + j[--i]
                
            + "Monitor: " + j[++i]+ "marca: " + this.monitor.getMarca() + j[i]
            + "modelo: " + this.monitor.getModelo() + j[i]
            + "pulgadas: " + Integer.toString(this.monitor.getPulgadas()) + j[--i]
                
            + "Mouse: " + j[++i] + "marca: " + this.mouse.getMarca() + j[i]
            + "modelo: " + this.mouse.getModelo() + j[i]
            + "tipo: " + this.mouse.getModelo() + j[--i]
                
            + "Teclado: " + j[++i] + "marca: " + this.teclado.getMarca() + j[i]
            + "modelo: " + this.getModelo() + j[i]
            + "número de teclas: " + Integer.toString(this.teclado.getNumeroDeTeclas()) +j[i]
            + "multimedia: " + Integer.toString(this.teclado.getMultimedia())
        );
    }
    
}