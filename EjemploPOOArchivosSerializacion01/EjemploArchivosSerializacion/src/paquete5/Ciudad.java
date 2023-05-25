package paquete5;

import java.io.Serializable;

public class Ciudad implements Serializable{
    
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String prv){
        
        nombre = n;
        provincia = prv;
        
    }
    
    public void establecerNombre(String n){
    
        nombre = n;
        
    }
    
    public void establecerProvincia(String n){
    
        provincia = n;
        
    }
    
    public String obtenerNombre(){
    
        return nombre;
    
    }
    
    public String obtenerProvincia(){
    
        return provincia;
    
    }
    
}

