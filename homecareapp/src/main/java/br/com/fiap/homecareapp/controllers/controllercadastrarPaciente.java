package br.com.fiap.homecareapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.homecareapp.model.cadastrarPaciente;

@RestController
public class controllercadastrarPaciente {
    @GetMapping ("/api/cadastrarPaciente")
    public cadastrarPaciente show(){
        return new cadastrarPaciente("Brenda Mariana Fogaça",
                                     "05570160", 
                                     518, 
                                     "",
                                     "Rua Virgílio Ribeiro", "Jardim Amaralina");

    }
}
