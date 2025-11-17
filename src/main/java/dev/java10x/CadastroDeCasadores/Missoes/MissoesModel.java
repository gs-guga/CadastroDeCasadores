package dev.java10x.CadastroDeCasadores.Missoes;

import dev.java10x.CadastroDeCasadores.Cacadores.CacadorModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_Missoes")

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaMissao;
    private String dificuldade;

    @OneToMany (mappedBy = "missoes")
    private List<CacadorModel> cacador;

    public MissoesModel() {
    }

    public MissoesModel(String nomeDaMissao, String dificuldade) {
        this.nomeDaMissao = nomeDaMissao;
        this.dificuldade = dificuldade;

    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }


}

