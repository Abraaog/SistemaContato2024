package br.ufpb.dcx.abraao.sistema;

import br.ufpb.dcx.abraao.contato.Contato;
import java.util.ArrayList;

public interface SistemaContato {
    void adicionarContato(Contato contato);
    Contato pesquisarContatoPorNome(String nome);
    Contato pesquisarContatoPorTelefone(String telefone);
    ArrayList<Contato> listarContatos();
    void removerContatoPorNome(String nome);
    void removerContatoPorTelefone(String telefone);
    void atualizarTelefone(String nome, String novoTelefone);
    int contarContatos();


    ArrayList<Contato> getContatos();
}

