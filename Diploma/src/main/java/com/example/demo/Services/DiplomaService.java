package com.example.demo.Services;

import com.example.demo.DTO.AlumnoDTO;
import com.example.demo.DTO.DiplomaDTO;
import com.example.demo.DTO.MateriaDTO;

public class DiplomaService {

    public static DiplomaDTO obtenerDiploma(AlumnoDTO alumno, String userName){
        double promedio=0;
        String mensaje="";
        for(MateriaDTO m: alumno.getAsignaturasAprobadas()){
            promedio+=m.getNota();
        }
        promedio = promedio/alumno.getAsignaturasAprobadas().size();
        if(promedio>=9)
            mensaje = "Felicitaciones " + userName + "! Tu promedio es mayor a 9";

        return new DiplomaDTO(mensaje, promedio, alumno);
    }


}
