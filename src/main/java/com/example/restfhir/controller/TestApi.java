package com.example.restfhir.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hl7.fhir.dstu3.model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello")
public class TestApi {

    @GetMapping("/hello")
    @ApiOperation("Returns hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @GetMapping("/patient")
    @ApiOperation("Returns one patient")
    @ResponseBody
    public Patient getPatient() {
        // Working with RI structures is similar to how it works with the HAPI structures
        Patient patient = new Patient();
        patient.addName().addGiven("John").setFamily("Smith");
        patient.getBirthDateElement().setValueAsString("1998-02-22");
        return patient;
    }
}
