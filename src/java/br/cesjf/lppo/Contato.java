
package br.cesjf.lppo;


public class Contato {
    private Long id;
    private String nome;
    private String sobrenome;
    private String telefone;
    
    
    public Contato(){
        id = null;
        nome = null;
        sobrenome = null;
        sobrenome = null;
    }

   
    public Long getId() {
        return id;
    }

  
    public void setId(Long id) {
        this.id = id;
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
      
}
