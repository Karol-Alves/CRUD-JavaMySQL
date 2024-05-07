package br.com.agenda.aplication;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContatoDAO contatoDAO = new ContatoDAO();

        Contato contato = new Contato();
        contato.setNome("Henrique");
        contato.setIdade(25);
        contato.setDataCadastro(new Date());
        //contatoDAO.save(contato);

        //Atualizar contato
        Contato c1 = new Contato();
        c1.setNome("Karol Alves");
        c1.setIdade(29);
        c1.setDataCadastro(new Date());
        c1.setId(5); // Numero salvo no banco
        //contatoDAO.update(c1);

        //Deletar contato pelo ID
        //contatoDAO.deleteByID(1); //Numero do banco

        //Visualização registros
        for(Contato c : contatoDAO.getContatos()){
            System.out.println("Contato: " + c.getNome());
        }
    }
}
