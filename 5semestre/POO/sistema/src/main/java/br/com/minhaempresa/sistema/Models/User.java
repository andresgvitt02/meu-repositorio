package br.com.minhaempresa.sistema.Models;


public class User {
    private int id;
    private String name;
    private String email;

    public User(String name, int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
