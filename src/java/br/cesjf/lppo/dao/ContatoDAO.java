
package br.cesjf.lppo.dao;

import br.cesjf.lppo.Contato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContatoDAO {
        private PreparedStatement opListar;
        private PreparedStatement opNovo;
        
        public ContatoDAO() throws Exception{
            Connection conexao = ConnectionFactory.createConnection();
                opListar = conexao.prepareStatement("SELECT * FROM contato");
                
        }
    
    public List<Contato> listAll() throws Exception{
        try {
            List<Contato> contatos = new ArrayList<>();
            
            
           
            ResultSet resultado = opListar.executeQuery(" SELECT * FROM contato");
                while(resultado.next()){
                    Contato novoContato = new Contato();
                    novoContato.setId(resultado.getLong("id"));
                    novoContato.setNome(resultado.getString("nome"));
                    novoContato.setSobrenome(resultado.getString("sobrenome"));
                    novoContato.setTelefone(resultado.getString("telefone"));
                    
                    contatos.add(novoContato);
                }
            
            
            return contatos;
        } catch (SQLException ex){
            throw new Exception("Erro ao listar contatos no banco", ex);
        }
    }

    public void cria(Contato novoContato) throws Exception {
        try{
        Connection conexao = ConnectionFactory.createConnection();
        Statement operacao = conexao.createStatement();
        operacao.executeUpdate("INSERT INTO contato(nome, sobrenome, telefone) VALUES('"
                +novoContato.getNome()+ "','"
                +novoContato.getSobrenome()+ "','"
                +novoContato.getTelefone()+ "')");
        }catch(ClassNotFoundException ex){
            throw new Exception("Erro ao carregar o Driver", ex);
        }catch (SQLException ex){
            throw new Exception("Erro ao inserir o contato", ex);
        }
    }
}
