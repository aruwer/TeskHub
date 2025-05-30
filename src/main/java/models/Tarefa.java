package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
public class Tarefa {
    @Id
    private int id;
    private String nome;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Usuario responsavel;

    public Tarefa(int id, String nome, String prioridade, LocalDate dataVencimento, String status, LocalDate dataConclusao, Projeto projeto, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
        this.projeto = projeto;
        this.responsavel = responsavel;
    }
}