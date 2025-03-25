package Exercicio5;

public class Main {
    // Método principal para testes
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");

        aluno1.adicionarCurso("Matemática");
        aluno1.adicionarCurso("História");
        aluno1.adicionarCurso("Matemática"); // Testando curso duplicado
        aluno1.listarCursos();
    }
}
