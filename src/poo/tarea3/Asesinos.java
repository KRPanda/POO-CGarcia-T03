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
public class Asesinos extends Campeones {

    protected String dash;
    protected String amplificadorDeDaño;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        getDash();
        getBuff();
    }

    public void getDash() {
        System.out.println("El dash es: "+this.dash);
    }

    public void getBuff() {
        System.out.println("Su buff es: "+this.amplificadorDeDaño);    }

}
