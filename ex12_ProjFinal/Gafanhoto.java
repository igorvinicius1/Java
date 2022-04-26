package com.mycompany.projeto_final;

public class Gafanhoto extends Pessoa
{
    private String login;
    private int totAssistindo;

    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo); //herdando da classe mãe pessoa
        this.login = login; //o "login" em verde(esquerdo) é o atributo enquanto o preto(direita) é o parâmetro do construtor
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistindo=" + totAssistindo + '}';
        // o super garante que as informações da herança tbm sejam impressas
        
    }
    
    
      
}
