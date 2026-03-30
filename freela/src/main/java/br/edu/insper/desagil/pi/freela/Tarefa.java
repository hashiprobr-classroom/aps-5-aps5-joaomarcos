package br.edu.insper.desagil.pi.freela;

import java.util.Map;

public class Tarefa {
    private int id;
    private String descricao;
    private Momento inicio;
    private Momento fim;
    //Construtor
    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }
    //Metodos
    public void atualiza(Momento inicioa, Momento fima) {
        if (inicioa.minutos() >= fima.minutos()) {
            throw new IllegalArgumentException("Deu ruim");
        }
        this.inicio = inicioa;
        this.fim = fima;
    }

    //Get e Set
    public int getId() {
        return id;
    }

    public Momento getIncio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
