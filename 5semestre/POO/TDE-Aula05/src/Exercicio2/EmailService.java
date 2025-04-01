package Exercicio2;

// Serviço responsável apenas por enviar emails
class EmailService {
    public void enviarEmailBoasVindas(Usuario usuario) {
        System.out.println("Enviando email de boas-vindas para " + usuario.getEmail());
    }
}
