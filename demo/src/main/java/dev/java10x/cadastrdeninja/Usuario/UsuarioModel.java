package dev.java10x.cadastrdeninja.Usuario;


import dev.java10x.cadastrdeninja.Usuario.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// o Entity tranforma uma classe em uma entidade no banco dados
@Entity
@Table(name = "tb_Cadastro")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;

    // @ManytoOne um usuario tem uma unica missao
    @ManyToOne
    private MissoesModel  missoes;

    public UsuarioModel() {

    }

    public UsuarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
