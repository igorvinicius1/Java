package com.mycompany.projeto_final;

public class Main {

    public static void main(String[] args) 
    {
        Gafanhoto v[] = new Gafanhoto[2];
        v[0] = new Gafanhoto("gugu", "gustavo", 22, "M");
        
        System.out.println(v[0].toString());
        
        Video v2 = new Video("O resgate do soldado Ryan");
        v2.play();
        v2.pause();
        v2.setAvaliacao(10);
        v2.like();
        
        v2.setViews(1000);
        System.out.println(v2.toString());
    }
    
}
