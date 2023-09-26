package br.ucsal.lab.tarefas;

public class Tarefa {
		

	private String titulo;
	private String descricao;
	private boolean concluida;

		    
	public Tarefa(String titulo, String descricao, boolean concluida) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;
}
	
    public Tarefa() {
		// TODO Auto-generated constructor stub
	}

    
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false; 
    }
    
	public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public boolean isConcluida() {
        return concluida;
    }


    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
	}

    
    @Override
    public String toString() {
    	return "Tarefa [titulo=" + titulo + ", descricao=" + descricao +
    			", concluída=" + concluida + "]";
    }

	public boolean getConcluida() {
		// TODO Auto-generated method stub
		return false;
	}
}
