package com.mycompany.heranca_2;

public class Main 
{

    public static void main(String[] args)
    {
        Piloto_Reserva p1 = new Piloto_Reserva(); //chamando a "classe pobre" que apenas herda os atributos da mãe
        p1.setNome("Pietro Fitipaldi");
        p1.setIdade(25);
        p1.setSexo("Masculino");
        System.out.println(p1.toString());
        System.out.println("\n\n");
        
        Aprendiz a1 = new Aprendiz();
        a1.setMensalidade(1500000f);
        //a1.Pagar();
        a1.setNome("Nikkita Mazepin");
        a1.Pagar();
        System.out.println(a1.toString());
        
        Aprendiz_Patrocinado a2 = new Aprendiz_Patrocinado();
        a2.setMensalidade(1000000f);
        //a2.Pagar();
        a2.setNome("Iguinho");
        System.out.println(a2.toString());
        a2.renoPatrocinio();
        
    }
    
}
