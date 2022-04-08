package com.mycompany.carro_new;

public class Carrinho //classe
{
    String marca; //atributo
    String modelo; //atributo
    int ano; //atributo
    boolean ignicao; //atributo
    
    
    void ligado() //método
    {
        this.ignicao = true;
    }
    
    void desligado() //métod
    {
        this.ignicao = false;
    }
    
    void acelerar() //métod
    {
        if(this.ignicao == true)
        {
            System.out.println("CARRO LIGADO (VRUM VRUM VRUM)");
            
        }
        else
        {
            System.out.println("O CARRO ESTÁ DESLIGADO !!!");
        }
    }
    
    void status()//método que imprime os atributos
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Ignição: " + this.ignicao);
    }
}
