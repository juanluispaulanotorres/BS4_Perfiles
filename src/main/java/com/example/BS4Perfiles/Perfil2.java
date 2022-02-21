package com.example.BS4Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{

    private String perfil = "perfil2";

    @Override
    public void myFunction() {
        System.out.println("Nuevo texto para el perfil 2");
    }
}
