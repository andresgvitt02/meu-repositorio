package Exercicio2;

// Classe principal para testar a aplicação
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Andres Vitt", "andres@email.com");

        UsuarioService usuarioService = new UsuarioService();
        usuarioService.cadastrarUsuario(usuario);

        EmailService emailService = new EmailService();
        emailService.enviarEmailBoasVindas(usuario);
    }
}
