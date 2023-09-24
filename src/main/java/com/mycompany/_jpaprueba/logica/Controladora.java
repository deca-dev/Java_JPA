package com.mycompany._jpaprueba.logica;

import com.mycompany._jpaprueba.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno (alu);
    }
}
