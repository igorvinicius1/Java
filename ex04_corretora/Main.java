package com.mycompany.corretora;

public class Main 
{
    public static void main(String[] args) 
    {
        ContaCorretora p1 = new ContaCorretora();
        p1.setNumconta(1212);
        p1.setDono("Harry Potter"); 
        p1.abrirConta("Renda variável");
        p1.depositar(125); //depositando 125 réis
        p1.receber(65); // recebendo dividendos
        p1.sacar(25); //sacando 25 réis
        
        ContaCorretora p2 = new ContaCorretora();
        p2.setNumconta(3232);
        p2.setDono("Rony Weasley");
        p2.abrirConta("Renda fixa");
        p2.depositar(725);
        p2.sacar(2000);
        
        ContaCorretora p3 = new ContaCorretora();
        p3.setNumconta(4242);
        p3.setDono("Hermione Granger");
        p3.abrirConta("Conta Corrente");
        
        p1.situacao();
        p2.situacao();
        p3.situacao();
        
    }  
}
