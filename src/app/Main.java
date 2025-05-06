/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import model.ConfiguracionGlobal;
import model.FormularioContacto;

/**
 *
 * @author vicen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConfiguracionGlobal configuracion = ConfiguracionGlobal.getInstancia();
       // configuracion.setIdioma("Ingles");
        configuracion.setLogo("lOGO.png");
        
        //Formulario de contacto 
        
        String idioma = configuracion.getIdioma();
        System.out.println("Idioma: "+idioma);
        System.out.println("-----------------------");
        FormularioContacto formulario = new FormularioContacto();
        formulario.personalizar("Formulario de contacto  ", "Nombre");
        formulario.personalizar("Formulario de contacto  ", "Email");
 
        
        formulario.mostrar();
        
        
        FormularioContacto clonFormulario = formulario.clone();
        clonFormulario.personalizar("Formulario de contacto ", "Telefono");
        clonFormulario.mostrar();
        
    }
    
}
