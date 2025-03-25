package Exercicio4;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        setSenha(senha); // Usa o setter para validar a senha
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 6) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("A senha deve ter no mínimo 6 caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Usuario{nome='" + nome + "', email='" + email + "'}";
    }


}

