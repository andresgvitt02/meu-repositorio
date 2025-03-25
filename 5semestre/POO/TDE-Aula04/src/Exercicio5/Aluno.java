package Exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<String> cursos;

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    // Método para adicionar um curso
    public void adicionarCurso(String curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso " + curso + " adicionado para o aluno " + nome);
        } else {
            System.out.println("O aluno " + nome + " já está matriculado no curso " + curso);
        }
    }

    // Método para listar os cursos do aluno
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("O aluno " + nome + " não está matriculado em nenhum curso.");
        } else {
            System.out.println("Cursos do aluno " + nome + ": " + String.join(", ", cursos));
        }
    }


}

