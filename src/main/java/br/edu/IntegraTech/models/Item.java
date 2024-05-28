package br.edu.IntegraTech.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "itens")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataDeAdesao;
    @Column(name = "descricao" , columnDefinition="text")
    private String descricao;
    private String dataDeFabricacao;
    private String fabricante;
    @Column(name = "historia", columnDefinition="text")
    private String historia;
    private String estadoDeConservacao;

    public Item(){

    }

    public Item(String nome, String dataDeAdesao, String descricao, String dataDeFabricacao, String fabricante, String historia, String estadoDeConservacao) {
        this.nome = nome;
        this.dataDeAdesao = dataDeAdesao;
        this.descricao = descricao;
        this.dataDeFabricacao = dataDeFabricacao;
        this.fabricante = fabricante;
        this.historia = historia;
        this.estadoDeConservacao = estadoDeConservacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }


    public String getDataDeAdesao() {
        return dataDeAdesao;
    }

    public void setDataDeAdesao(String dataDeAdesao) {
        this.dataDeAdesao = dataDeAdesao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(String dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public String getFabriccante() {
        return fabricante;
    }

    public void setFabriccante(String fabriccante) {
        this.fabricante = fabriccante;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getEstadoDeConservacao() {
        return estadoDeConservacao;
    }

    public void setEstadoDeConservacao(String estadoDeConservacao) {
        this.estadoDeConservacao = estadoDeConservacao;
    }
}
