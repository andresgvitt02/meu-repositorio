package Exercicio2;

// Serviço responsável apenas por cadastrar usuários
class UsuarioService {
    public void cadastrarUsuario(Usuario usuario) {
        System.out.println("Usuário " + usuario.getNome() + " cadastrado com sucesso!");
    }
}
