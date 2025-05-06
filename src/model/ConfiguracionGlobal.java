/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author vicen
 */
public class ConfiguracionGlobal {
    
    //Aca van los atributos  
    //Configuracion global para instanciar  y agregar un idioma y su logo 
    private static ConfiguracionGlobal instance;
    private String idioma;
    private String logo;

    

    // realizo un contructor de configuracionGlobal con para parametros pree establecidos 
    private ConfiguracionGlobal() {
    this.idioma = "Español";
        this.logo = "logo.png";

    }

    
    // Metodo de getInstacia  si la instancia es nula realizamos una instancia a ConfiguracionGlobal y retornamos instancia
   public static ConfiguracionGlobal getInstancia() {
        if (instance == null) {
            instance = new ConfiguracionGlobal();
        }
        return instance;
    }


//Get y setter de idiomas 
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    //get y setter para logo
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }


    
    
    
    
}
