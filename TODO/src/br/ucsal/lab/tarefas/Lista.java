package br.ucsal.lab.tarefas;
import java.util.ArrayList;
import java.util.List;
public class Lista {


    private List<Tarefa> tarefas;


    public Lista() {
        this.tarefas = new ArrayList<>();
    }


    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public void adicionarTarefa(String titulo, String descricao) {
        this.adicionarTarefa(titulo,descricao,false);
    }

    public void adicionarTarefa(String titulo, String descricao, Boolean concluida) {
        Tarefa tarefa = new Tarefa(titulo, descricao,concluida);
        this.adicionarTarefa(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }


    public List<Tarefa> getTarefas() {
        return tarefas;
    }

}

