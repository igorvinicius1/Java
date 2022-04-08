package com.mycompany.carro3_new;

public class Main 
{
    public static void main(String[] args) 
    {
        Carrinho c1 = new Carrinho("Ferrari", 1999, "Vermelhinha"); //Utilizando método construtor passando os atributos pelos parâmetros
        c1.status();
        System.out.println("\nUsando os Get e Set para acessar privates\n");
        
        c1.setModelo("McLaren");//Método acessor, só precisa passar o parâmetro para definir o atributo
        c1.setAno(1999);//O método permite manipular os atributos privados da classe "Carrinho"
        c1.status();
        
        System.out.println("\nMODELO DO CARRO ACESSADO PELO MÉTODO NA MAIN: " + c1.getModelo());
    }    
}
