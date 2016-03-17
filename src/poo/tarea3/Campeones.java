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
public abstract class Campeones implements Cliente{
    protected String nombre;
    protected String sexo;
    protected String raza;
    protected String tipoDeDaño;
    protected int rango;
    protected String rol;
    protected String pasiva;
    protected String habilidades;
    
    public void mostrarDatos(){
        muestraRol(); 
        muestraNombre();
        mostrarP();
        mostrarH();
        mostrarTipoDeDaño();
        muestraSexo();
    }
    @Override
    public void muestraRol() {
        System.out.println("El rol de "+this.nombre+" es "+this.rol);
    }

    @Override
    public void muestraNombre() {
        System.out.println("El campeon se llama "+this.nombre);    }

    @Override
    public void mostrarP() {
        System.out.println("Su pasiva es "+this.pasiva);
    }

    @Override
    public void mostrarH() {
        System.out.println("Sus habilidades son"+this.habilidades);
    }

    @Override
    public void mostrarTipoDeDaño() {
        System.out.println("El tipo de daño es "+this.tipoDeDaño);
    }

    public void muestraSexo(){
        System.out.println("sexo: "+this.sexo);
    }
     
    
}
