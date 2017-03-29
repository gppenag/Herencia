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
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("maria",21423432,"soltera",34.4);
        Programador p1 = new Programador(6, "java ", "gina", 6,"Soltera", 6);
        Director d1 = new Director(2, "natal", 346456, "casada", 56);
        Empresa empresa = new Empresa();
        empresa.adicionarEmpleado(e1);
        empresa.adicionarEmpleado(p1);
        empresa.adicionarEmpleado(d1);
        empresa.imprimirempleado();
    }
}
