package br.ufpb.dcx.abraao.sistema;

import br.ufpb.dcx.abraao.contato.Contato;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class SistemaContatoImpl implements SistemaContato {
    private Map<String, Contato> contatos;

    public SistemaContatoImpl() {
        this.contatos = new HashMap<>();
    }

    public void validarDados(Contato contato) {
        if (contato.getNome() == null || contato.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        if (contato.getSobrenome() == null || contato.getSobrenome().isEmpty()) {
            throw new IllegalArgumentException("Sobrenome não pode ser nulo ou vazio");
        }
        if (contato.getTelefone() == null || contato.getTelefone().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo ou vazio");
        }
        if (contato.getEmail() == null || contato.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio");
        }
    }

    @Override
    public void adicionarContato(Contato contato) {
        validarDados(contato);
        contatos.put(contato.getNome(), contato);
    }

    @Override
    public Contato pesquisarContatoPorNome(String nome) {
        return contatos.get(nome);
    }

    @Override
    public Contato pesquisarContatoPorTelefone(String telefone) {
        for (Contato contato : contatos.values()) {
            if (contato.getTelefone().equals(telefone)) {
                return contato;
            }
        }
        return null;
    }



    public ArrayList<Contato> listarContatos() {
        if (contatos == null) {
            contatos = new HashMap<>(); // Inicializa a lista de contatos se estiver nula
        }
        return new ArrayList<>(contatos.values());
    }


    @Override
    public void removerContatoPorNome(String nome) {
        contatos.remove(nome);
    }

    @Override
    public void removerContatoPorTelefone(String telefone) {
        contatos.values().removeIf(contato -> contato.getTelefone().equals(telefone));
    }

    @Override
    public void atualizarTelefone(String nome, String novoTelefone) {
        Contato contato = contatos.get(nome);
        if (contato != null) {
            contato.setTelefone(novoTelefone);
        }
    }

    @Override
    public int contarContatos() {
        return contatos.size();
    }

    @Override
    public ArrayList<Contato> getContatos() {
        return new ArrayList<>(contatos.values());
    }}

