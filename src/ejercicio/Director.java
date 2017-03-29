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
public class Director extends Empleado{
    protected int anyosExperiencia;

    public Director(int añosExperiencia, String nombre, int identificacion, 
            String estadociv, double salario) {
        super(nombre, identificacion, estadociv, salario);
        this.anyosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return anyosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.anyosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Director{" + "a\u00f1osExperiencia=" + anyosExperiencia + '}'+super.toString();
    }
    
    
    
}
