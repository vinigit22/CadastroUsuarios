package dev.java10x.cadastrdeninja.Usuario.Missoes;

import dev.java10x.cadastrdeninja.Usuario.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String dificuldade;

    private UsuarioModel usuario;

    @OneToMany(mappedBy = "missoes")
    @JoinColumn(name = "missoes_id") // foreing key chave estrangeira
    private List<UsuarioModel> usuarios;

}
