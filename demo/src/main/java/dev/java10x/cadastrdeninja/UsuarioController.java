package dev.java10x.cadastrdeninja;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {

    @GetMapping("/boasvindas")
    public String BoasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";

    }
}
