package atividade;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante1 = new Estudante("Thiago", " Rua Papagaio");
			estudante1.addCursoNota("Matematica", 8);
			estudante1.addCursoNota("Informatica", 9);
			
			Estudante estudante2 = new Estudante("Cleide", " Rua Santos Drumont");
			estudante2.addCursoNota("Historia", 7);
			estudante2.addCursoNota("Biologia", 8);
			estudante2.addCursoNota("Informatica", 9);
			
			Estudante estudante3 = new Estudante("Diego", " Rua Emilia");
			estudante3.addCursoNota("Historia", 9);
			estudante3.addCursoNota("Matematica", 7);
			estudante3.addCursoNota("Informatica", 6);
			estudante3.addCursoNota("Biologia", 8);
			pessoas.add(estudante1);
			pessoas.add(estudante2);
			pessoas.add(estudante3);

			Professor  professor1 = new Professor("José", " Rua Bartolomeu");
			professor1.addCurso("matematica");
			professor1.addCurso("biologia");
			
			Professor professor2 = new Professor("Lucas", " Rua Vitória");
			professor2.addCurso("informatica");
			professor2.addCurso("historia");
			
			pessoas.add(professor1);
			pessoas.add(professor2);
			
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor prof = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < prof.getCursos().size(); y++) {
						str += "Curso: "+ prof.getCursos().get(y)+"\n";
						str += "Professor: " + prof.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(prof.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}
}
