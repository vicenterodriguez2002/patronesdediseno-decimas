/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author vicen
 */
public class FormularioContacto implements Cloneable{
    
    
    //Atributos de titulo y campos que esto es una lista 
    private String titulo;
    private List<String> campos;
    
    
    //constructor  en el cual instanciamos un Arraylist 
    public FormularioContacto() {
    this.campos = new java.util.ArrayList<>();
    }
    
    // metodo en el cual el usuario podra personalizar el titulo y campo añadiendo al ArrayList
     public void personalizar(String titulo , String campo) {
        this.titulo = titulo;
        this.campos.add(campo);
    }
    
   
  //  Método que realiza una clonacion profunda (deep copy) del objeto FormularioContacto.
  // * Se utiliza el mecanismo de clonación de la clase Object para realizar una copia del objeto.
  //Ademas, se asegura de crear una nueva lista (ArrayList) para el atributo "campos",
     
@Override
public FormularioContacto clone(){
    try {
        FormularioContacto clon = (FormularioContacto) super.clone();
        clon.campos = new java.util.ArrayList<>(this.campos);
        return clon;
    } catch (CloneNotSupportedException e) {
        throw  new AssertionError();
    }

}


//Metodo que muestra los datos al ser llamado
public  void  mostrar (){

    System.out.println("Titulo: "+ this.titulo);
    System.out.println("Campos ");
    for ( String campo : campos){
        System.out.println(" - "+ campo);
    }

}
    
    
}
