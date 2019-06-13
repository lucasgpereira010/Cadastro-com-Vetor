package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {
//att
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null,"Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null,"Endereço: "));
		professor.setBairro(JOptionPane.showInputDialog(null,"Bairro: "));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"CEP: ")));
		professor.setCidade(JOptionPane.showInputDialog(null,"Cidade: "));
		professor.setEstado(JOptionPane.showInputDialog(null,"Estado: "));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"RG: ")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"CPF: ")));
		
		JOptionPane.showMessageDialog(null,"Nome: "+ professor.getNome() + "\n Endereço: " + professor.getEndereco() + "\n Bairro: " + professor.getBairro() + "\n CEP: " + professor.getCep() + "\n Cidade: " + professor.getCidade() + "\n Estado: " + professor.getEstado() + "\n RG: " + professor.getRg() + "\n CPF: " + professor.getCpf());
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas disciplinas você possui?"));
			String disciplinas[] = new String[100];
			for(int i =0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
			}
			for(int i2 =0; i2 < dis; i2++) {
				int cont = i2 +1;
				JOptionPane.showMessageDialog(null,"Disciplina " + cont + ": " +professor.getDisciplinas()[i2]);
			}
			professor.setDisciplinas(disciplinas);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cursos você possui?"));
			String cursos[] = new String[100];
			for(int i =0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso " + i);
			}
			for(int i3 =0; i3 < cur; i3++) {
				int cont2 = i3 +1;
				JOptionPane.showMessageDialog(null,"Curso " + cont2 + ": " + professor.getCursos()[i3]);
			}
			professor.setCursos(cursos);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
