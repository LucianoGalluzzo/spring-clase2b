package com.example.demo.Controllers;

import com.example.demo.DTO.AlumnoDTO;
import com.example.demo.DTO.DiplomaDTO;
import com.example.demo.Services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DiplomaController {

    @PostMapping("/diploma")
    public ResponseEntity obtenerDiploma(@RequestBody AlumnoDTO alumno, @RequestHeader Map<String, String> headers){

        DiplomaDTO diploma = DiplomaService.obtenerDiploma(alumno, headers.get("user-name"));

        return new ResponseEntity(diploma, HttpStatus.OK);

    }
}
