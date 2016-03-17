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
public class championSelect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        // TODO code application logic here
       Tiradores tirador = new Tiradores();
       
       tirador.nombre = "Lucian";
       tirador.rango = 550;
       tirador.sexo = "Masculino";
       tirador.raza = "Humano";
       tirador.tipoDeDaño = "Daño Fisico";
       tirador.rol = "tirador";
       tirador.pasiva = "Balas Luminosas";
       tirador.habilidades = "Luz lacerante, Resplandor Ardiente, Persecucion implacable, El sacrificio";
       tirador.mostrarDatos();
       

       
        Asesinos asesino = new Asesinos();
        
        asesino.nombre = "LeBlanc";
        asesino.sexo = "Femenino";
        asesino.raza = "Humana";
        asesino.tipoDeDaño = "Poder de Habilidad";
        asesino.rol = "Asesino";
        asesino.dash = "Distorcion";
        asesino.amplificadorDeDaño = "Sello de la maldad";
        asesino.pasiva = "Imagen especular";
        asesino.habilidades = "Sello de la Maldad, Distorcion, Cadenas Etereas, Mimica";
        asesino.mostrarDatos();
        
        tankes tanke = new tankes();
        
        tanke.nombre = "Poppy";
        tanke.sexo = "Femenino";
        tanke.raza = "Yordle";
        tanke.tipoDeDaño = "Daño Fisico";
        tanke.rol = "Tanke";
        tanke.crowdControl = "Veredicto de la Guardiana";
        tanke.escudos = "Luchadora Valiente";
        tanke.pasiva = "Luchadora valiente";
        tanke.habilidades = "Impacto de martillo, Entereza inalterable, Carga heroica, Veredicto de la guardiana";
        tanke.curacion = "Inexistente";
        
         tanke.mostrarDatos();
     }
    
}
