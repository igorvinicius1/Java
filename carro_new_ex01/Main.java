package com.mycompany.carro_new;

public class Main 
{
    public static void main(String[] args) 
    {
        Carrinho McLaren = new Carrinho();//instanciano um objeto
        McLaren.marca = "McLaren";//atributo...
        McLaren.ano = 1999;
        McLaren.modelo = "Único";
        McLaren.ignicao = true;
        
        McLaren.ligado();
        McLaren.acelerar();
        McLaren.status();//chama o método
        
        System.out.println("\n\n");
        
        Carrinho c2 = new Carrinho();
        c2.marca = "Ferrari";
        c2.ano = 1999;
        c2.modelo = "Caveirão";
        c2.ignicao = false;
        
        c2.desligado();
        c2.acelerar();
        c2.status();
        
    } 
}
