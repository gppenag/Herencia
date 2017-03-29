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
public class Programador extends Empleado {
   protected int lineasHora;
   protected String lengPrograma;

    public Programador(int lineasHora, String lengPrograma, String nombre, 
            int identificacion, String estadociv, double salario) {
        super(nombre, identificacion, estadociv, salario);
        this.lineasHora = lineasHora;
        this.lengPrograma = lengPrograma;
    }

    public int getLineasHora() {
        return lineasHora;
    }

    public void setLineasHora(int lineasHora) {
        this.lineasHora = lineasHora;
    }

    public String getLengPrograma() {
        return lengPrograma;
    }

    public void setLengPrograma(String lengPrograma) {
        this.lengPrograma = lengPrograma;
    }

    @Override
    public String toString() {
        return "Programador{" + "lineasHora=" + lineasHora + ", lengPrograma=" + lengPrograma + '}'+super.toString();
    }
    
    
   
}
