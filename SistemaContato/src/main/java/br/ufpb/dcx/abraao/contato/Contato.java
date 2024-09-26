package br.ufpb.dcx.abraao.contato;

import br.ufpb.dcx.abraao.endereco.Endereco;

public class Contato {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Contato(String nome, String sobrenome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Update contact details
    public void updateContactDetails(String nome, String sobrenome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // Get full name
    public String getFullName() {
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
