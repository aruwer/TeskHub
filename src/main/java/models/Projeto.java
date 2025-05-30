package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "projeto")
public class Projeto {
    @Id
    private int id;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaFim;

    public Projeto(int id, String descricao,
                   LocalDate dataInicio, LocalDate dataPrevistaFim) {
        this.id = id;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataPrevistaFim = dataPrevistaFim;
    }

}