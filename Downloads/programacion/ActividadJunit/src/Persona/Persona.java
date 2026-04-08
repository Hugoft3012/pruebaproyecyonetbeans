package Persona;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hugo.fidtra
 */
public class Persona {
    
    //hola buenos dias a todos
    private String nombre;
    private int edad;
    private double altura; // en metros

    // Constructor
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser positiva");
        }
        this.altura = altura;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para aumentar la edad en 1 año
    public void cumplirAnios() {
        this.edad += 1;
    }

    // Getter para la altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el índice de masa corporal (IMC)
    public double calcularIMC(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser positivo");
        }
        return peso / (altura * altura);
    }

}
