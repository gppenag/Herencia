/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

/**
 *
 *  profAsig
    un estud tiene por semestre 
    1materia 4notas 1prof
    por cada estudiante mostrar promedio, materia que 
    cursa, prof asigna, direccion y tel del estudiante como del profesor
 */
public class Estudiante extends Persona{
  private double notas[]= new double [4];
  private double promedio=0;

    public Estudiante(double[] notas, String nombre, String materia, String direccion, int telefono) {
        super(nombre, materia, direccion, telefono);
        this.notas = notas;
    }
    
    public void promedio(){
        for (int i = 0; i < notas.length; i++) {
          promedio += (notas[i]/notas.length);
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "notas=" + notas + ", promedio=" + promedio + '}'+super.toString();
    }
  
    
   
}
