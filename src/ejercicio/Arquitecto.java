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
public class Arquitecto extends Empleado{
    private int cantProy;

    public Arquitecto(int cantProy, String nombre, int identificacion, 
            String estadociv, double salario) {
        super(nombre, identificacion, estadociv, salario);
        this.cantProy = cantProy;
    }

    public int getCantProy() {
        return cantProy;
    }

    public void setCantProy(int cantProy) {
        this.cantProy = cantProy;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "cantProy=" + cantProy + '}'+super.toString();
    }
       
    
}
