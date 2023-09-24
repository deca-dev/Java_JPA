package com.mycompany._jpaprueba.persistencia;

import com.mycompany._jpaprueba.logica.Alumno;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }
}
