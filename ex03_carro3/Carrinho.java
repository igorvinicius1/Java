package com.mycompany.carro3_new;

public class Carrinho 
{
    public String modelo; //acesso publico
    private int ano; //acesso privado
    private String cor;
    private boolean ignicao;
    
    public Carrinho(String m, int a, String c) //Método construtor TEM q ter o mesmo nome da classe
    {
        this.modelo = m; //os atributos vão ser os parâmetros
        this.ano = a;
        this.cor = c;
        this.ligado();
    }
    
    //Métodos get e set permitem acessar atributos privados, protegendo-o de outras classes
    
    public String getModelo() 
    {
        return this.modelo;
    }
    
    public void setModelo(String m)//cria-se a variavel dentro do método para poder altera-la na main
    {
        this.modelo = m;
    }
    
    public int getAno() //retorna o atributo
    {
        return this.ano;
    }
    //método acessor
    public void setAno(int a) //permite acessar atributos privados
    {
        this.ano = a;
    }
    //O método permite manipular atributos privados na Main, sem precisar acessa-los de fato
    
    public void ligado()
    {
        this.ignicao = true;
    }
      
    public void desligado()
    {
        this.ignicao = false;
    }
            
    public void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ligado: " + this.ignicao);
    }
    
}
