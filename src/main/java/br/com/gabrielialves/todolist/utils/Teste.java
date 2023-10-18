package br.com.gabrielialves.todolist.utils;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class Teste {

    @PostMapping
    public void teste() {
        String x = "   {\"codigo\": 123456 }";
        org.json.JSONObject json = new org.json.JSONObject(x);
        Long retorno = json.optLongObject("codigo").longValue();
        System.out.println(retorno);

    }

}
