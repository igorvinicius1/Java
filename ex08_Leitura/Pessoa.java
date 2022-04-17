package com.mycompany.leitura;

public class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(String nome)
    {
        if(this.getNome().equals(nome))
        {
            this.setIdade(this.getIdade()+1);
            
            System.out.println("PARABÉNS " + this.getNome() + " !!! AGORA VOCÊ TEM " + this.getIdade() + " ANINHUSSS ;)");
        }
        else
        {
            System.out.println("\n--- O SISTEMA ACEITA APENAS NOMES PREVIAMENTE CADASTRADODS PARA DAR OS PARABÉNS ---\n");
        }
    }
    
    public void insereDados(String n, int i, String s)
    {
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);  
    }
    
    public void imprime()
    {
        System.out.println("Nome: " + this.getNome() + " Idade: " + this.getIdade() + " Sexo: " + this.getSexo());
    }
    
    //getters and setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

      
}
