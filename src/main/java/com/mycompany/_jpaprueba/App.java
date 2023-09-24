package com.mycompany._jpaprueba;

import com.mycompany._jpaprueba.logica.Alumno;
import com.mycompany._jpaprueba.logica.Carrera;
import com.mycompany._jpaprueba.logica.Controladora;
import com.mycompany._jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class App {

    public static void main(String[] args) {
       
        Controladora control = new Controladora();
        
        //Creamos lista de materias y agregamos
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        
        //Creación carrera
        Carrera carre = new Carrera(25, "Tecnicatura Programación", listaMaterias);
        
        //Guardando carrera en BD
        control.crearCarrera(carre);
        
        //Crear materias
        Materia mate1 = new Materia(58, "Programación 1", "Cuatrimestral", carre);
        Materia mate2 = new Materia(59, "Programación 2", "Cuatrimestral", carre);
        Materia mate3 = new Materia(60, "Programación avanzadaa", "Anual", carre);
        
        //Guardando materias en BD
        control.crearMateria(mate1);
        control.crearMateria(mate2);
        control.crearMateria(mate3);
        
        //Agregando materias a la lista
        listaMaterias.add(mate1);
        listaMaterias.add(mate2);
        listaMaterias.add(mate3);
        
        //Editando carrea y asosicando listado de materias
        carre.setListaMaterias(listaMaterias);
        control.editarCarrera(carre);
                
        //Creación alumno con carrea
       Alumno alumno1 = new Alumno(2, "David", "Castro", new Date(), carre);
       //Guardado el alumno en BD
       control.crearAlumno(alumno1);
       
       //Resultado
        System.out.println("----------DATOS ALUMNO--------");
        Alumno alu = control.traerAlumno(2);
        System.out.println("Alumno: " + alu.getNombre() + ' ' + alu.getApellido());
        System.out.println("Cursa la carrera de " + alu.getCarrera().getNombre());
      
    }
}
