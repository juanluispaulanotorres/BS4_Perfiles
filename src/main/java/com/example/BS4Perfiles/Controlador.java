package com.example.BS4Perfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class Controlador {

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String passwd;

    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;

    @Autowired
    Perfiles iPerfiles;

    @GetMapping("/parametros")
    public String valoresPropiedades() {
        return "URL: " + url + " Password: " + passwd;
    }

    @GetMapping("/miconfiguracion")
    public String valoresMisPropiedades() {

        Configuracion conf = new Configuracion();

        conf.setValor1(valor1);
        conf.setValor2(valor2);

        valor1 = conf.getValor1();
        valor2 = conf.getValor2();

        return "URL: " + url + " Password: " + passwd + "<br>Valor1: " + valor1 + " Valor2: " + valor2;
    }

    @GetMapping("/perfil")
    public String getValPerfil() {
        iPerfiles.myFunction();
        return iPerfiles.toString();
    }
}
