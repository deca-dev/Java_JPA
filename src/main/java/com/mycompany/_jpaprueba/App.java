package com.mycompany._jpaprueba;

import com.mycompany._jpaprueba.logica.Alumno;
import com.mycompany._jpaprueba.logica.Controladora;
import java.util.Date;


public class App {

    public static void main(String[] args) {
       
        Controladora control = new Controladora();
       
        Alumno alu1= new Alumno(30, "Luisina", "JPA", new Date());
        
        control.crearAlumno(alu1);
    }
}
