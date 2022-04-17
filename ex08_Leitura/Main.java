package com.mycompany.leitura;

public class Main 
{

    public static void main(String[] args) 
    {
        Pessoa p = new Pessoa();
        p.insereDados("igor", 22, "masculino");
        p.imprime();
        p.fazerAniver("igor");
        Livro l = new Livro("Harry Potter", "JK Rowling", 727, 1, "igor");
        //Livro l = new Livro("Harry Potter", "JK Rowling", 727, 1, "igorrt");
        l.fechar();
        l.fechar();
        l.abrir();
        
        for(int i = 1; i <= 10; i++)//avançando 10 paginas
        {
            if(l.getAberto() == false)
            {
                i = 11;
            }
            else
            {
                l.avancarPag();
            }
            
        }
        
        l.voltarPag();
        l.voltarPag();
        l.detalhes(p);
        
        
        
        
    }
    
}
