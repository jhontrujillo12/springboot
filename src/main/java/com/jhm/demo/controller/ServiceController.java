package com.jhm.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin( "*" )
@RestController
@RequestMapping( value = "v1/SayHi" )
public class ServiceController {
    
    
    @GetMapping( path = "/{name}" )
    public ResponseEntity<Object> getPrescription( @PathVariable( "name" ) String name )

            throws Exception {

        return ResponseEntity.ok( "Hello "+ name );
    }

}
