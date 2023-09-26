package br.ucsal.lab.tarefas;

public class Programa {
	

	    public static void main(String[] args) {
	        Tarefa t1 = new Tarefa("Estudar 00", "Devo estudar 00", false);
	        Tarefa t2 = new Tarefa("Tomar cafe", "Tomar cafe", true);
	        Tarefa t3 = new Tarefa("Ouvir musica", "Ouvir Rock", true);

	        
	        Lista listaTarefas = new Lista();
	        listaTarefas.adicionarTarefa("Estudar 00", "Devo estudar 00", false);
	        listaTarefas.adicionarTarefa("Tomar cafe", "Tomar cafe", true);
	        listaTarefas.adicionarTarefa("Ouvir musica", "Ouvir Rock", true);
	        new InterfaceGrafica(listaTarefas);
	        }
	    }
	

