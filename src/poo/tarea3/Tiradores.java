/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.tarea3;

/**
 *
 * @author carlos
 */
public class Tiradores extends Campeones {

    protected boolean rangoMayorA500 = true;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        getRango();
    }

    public void getRango() {
        System.out.println("Rango es mayor a 500 = "+this.rangoMayorA500);
    }
}
