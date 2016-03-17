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
public class tankes extends Campeones {

    protected String crowdControl;
    protected String escudos;
    protected String curacion;

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        getCC();
        getEscudos();
        getCuracion();
    }

    public void getCC() {
        System.out.println("Su CrowdControl es "+this.crowdControl);
    }

    public void getEscudos() {
        System.out.println("Su escudo es "+this.escudos);    }

    public void getCuracion() {
        System.out.println("Su curacion es "+this.curacion);
    }
}
