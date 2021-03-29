package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiplomaDTO {

    private String mensaje;
    private double promedio;
    private AlumnoDTO alumno;

}
