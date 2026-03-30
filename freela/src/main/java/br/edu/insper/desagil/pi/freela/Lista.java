package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    //Construtor
    public Lista() {
        this.tarefas = new ArrayList<>();
    }
    //Metodo
    public void adiciona(Tarefa tarefa) {
        int identificador = tarefa.getId();
        for (Tarefa task : tarefas) {
            int idtask = task.getId();
            if (identificador == idtask) {
                return;
            }
        }
        tarefas.add(tarefa);

    }

    //Get e Set
    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
