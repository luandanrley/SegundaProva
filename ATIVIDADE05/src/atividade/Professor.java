package atividade;

import java.util.ArrayList;

public class Professor extends Pessoa {
	
	@SuppressWarnings("unused")
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	
	
	public Professor(String nome, String endereco) {
		super(nome, endereco);	
	}
	public ArrayList<String> getCursos() {
		return this.cursos;
	}
	public boolean addCurso(String curso) {
		
		if(cursos.add(curso.toLowerCase())) {			
			numCursos++;
			return true;
			
		}else {
			return false;
		}
	}
	public boolean remmoverCurso(String curso) {
		
	  for(int i = 0; i< cursos.size(); i++) {
		  
		  if(cursos.get(i).compareTo(curso.toLowerCase()) == 0) {
			  cursos.remove(i);
			  return true;
		  }
	  }
	  return false;
	}
	
	public String toString() {
		
		String str = "Nome:"+this.getNome()+"|Endereço:"+this.getEndereco()+"\n";
		
		for(int i =0; i < cursos.size(); i++) {
			
			str += "Curso: "+cursos.get(i)+"\n";
		}
		return str;			
	}
}
