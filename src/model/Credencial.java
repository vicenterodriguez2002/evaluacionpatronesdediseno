/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vicen
 */
public class Credencial implements Cloneable {

    private String nombreAsistente;
    private String cargo;
    private String rut;

    public Credencial() {
    }

    public Credencial(String nombreAsistente, String cargo, String rut) {
        this.nombreAsistente = nombreAsistente;
        this.cargo = cargo;
        this.rut = rut;
    }

    public void personalizacionCredencial(String nombre, String cargo, String rut) {

        this.nombreAsistente = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    @Override
    public Credencial clone() {
        try {
            Credencial clon = (Credencial) super.clone();
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }

    }

    public void MostrarCredencial() {

        System.out.println("Credencial de " + this.nombreAsistente);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("RUT: " + rut);
    }

}
