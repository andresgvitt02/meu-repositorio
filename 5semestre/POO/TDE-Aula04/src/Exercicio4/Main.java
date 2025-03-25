package Exercicio4;

public class Main {
    // Método principal para teste
    public static void main(String[] args) {
        try {
            Usuario user1 = new Usuario("João", "joao@email.com", "123456");
            System.out.println(user1);

            // Teste com senha inválida
            Usuario user2 = new Usuario("Maria", "maria@email.com", "0397203");
            System.out.println(user2);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }
    }
}
