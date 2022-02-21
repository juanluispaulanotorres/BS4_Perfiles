package com.example.BS4Perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{

    private String perfil = "perfil1";

    @Override
    public void myFunction() {
        System.out.println("Texto del perfil 1");
    }
}
