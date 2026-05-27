package com.example.Proyecto_ABCC_MySQL.services;

import java.util.List;

import com.example.Proyecto_ABCC_MySQL.models.AlumnoModel;

public interface AlumnoService {
    List <AlumnoModel> getAllAlumnos();
    void saveAlumno(AlumnoModel alumno);
    AlumnoModel getAlumnoById(long id);
    void deleteAlumnoById(long id);
}
