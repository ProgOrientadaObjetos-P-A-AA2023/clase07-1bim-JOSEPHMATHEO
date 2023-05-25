package paquete5;

// @author JosephMatheo

import paquete5.Hospital;


public class Ejecutor {
    
    public static void main(String[] args) {
    
        // nombre del archivo
        String nombreArchivo = "data/hospital.data";
        
        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Cuenca", "Azuay");
        Ciudad c3 = new Ciudad("Guayas", "Guayaquil");
        Ciudad c4 = new Ciudad("Zamora", "Loja");
        Ciudad c5 = new Ciudad("Catamayo", "Loja");
        
        Hospital hospital1 = new Hospital("Isidro Ayora",10,
                105038.50, c1);
        Hospital hospital2 = new Hospital("Santa Maraiana",15, 
                105048.50, c2);
        Hospital hospital3 = new Hospital("Sagrado Corazon",20, 
                105058.50, c3);
        Hospital hospital4 = new Hospital("San Jhordy",25,
                105028.50, c4);
        Hospital hospital5 = new Hospital("San Salvador",30,
                105008.50, c5);

        paquete5.EscrituraArchivoSecuencial archivo = 
                new paquete5.EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(hospital1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(hospital3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        paquete5.LecturaArchivoSecuencial lectura = 
                new paquete5.LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        
        System.out.println(lectura);
    
    }
    
    
    
}
