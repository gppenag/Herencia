/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    protected String nombre;
    protected int identificacion;
    protected String estadociv;
    protected double salario;

    public Empleado(String nombre, int identificacion, String estadociv, double salario) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estadociv = estadociv;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadociv() {
        return estadociv;
    }

    public void setEstadociv(String estadociv) {
        this.estadociv = estadociv;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", estadociv=" + estadociv + ", salario=" + salario + '}';
    }
    
    
}
