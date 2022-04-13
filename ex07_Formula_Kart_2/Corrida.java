package com.mycompany.formula_kart_2;
import java.util.Random;

public class Corrida 
{
    private Piloto desafiado; //usa as caracteristicas da classe Piloto
    private Piloto desafiante;
    private int voltas;
    private boolean aprovado;
    
    //métodos
    public void marcarCorrida(Piloto p1, Piloto p2)
    {
        if(p1.getCategoria().equals(p2.getCategoria()) && p1 != p2) //mesma coisa que (p1.getCategoria() == p2.getCategoria)   
        {
            this.aprovado = true;
            
            this.desafiado = p1;
            System.out.println("piloto ---->   " +this.desafiado);
            this.desafiante = p2;
            //System.out.println("");
        }
        else if(p1 == p2)
        {
            System.out.println("Corrida precisa ser entre 2 pilotos distintos !!!");
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }   
        
        else
        {
            System.out.println("A corrida tem que ser entre pilotos da mesma categoria");
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void correr()
    {
        if(this.aprovado == true)
        {
            System.out.println("DESAFIADO --> " + this.desafiado);
            this.desafiado.apresentar();
            System.out.println("\nDESAFIANTE --> " + this.desafiante);
            this.desafiante.apresentar();
            
        }
        
        Random aleatorio = new Randoom();
            int vencedor; //0 1
            vencedor = aleatorio.nextInt(2); //0 1
                    
            System.out.println("\n --- RESULTADO --- \n");
            switch(vencedor)
            {
                case 0: // desafiado venceu
                    
                    System.out.println("VENCEDOR --> " + this.desafiado);
                    System.out.println("PERDEDOR --> " + this.desafiante);
                    this.desafiado.ganharCorrida();
                    this.desafiante.perderCorrida();
                    break;
                    
                case 1: // desafiado perdeu
                    
                    System.out.println("VENCEDOR --> " + this.desafiado);
                    System.out.println("PERDEDOR --> " + this.desafiante);
                    this.desafiante.perderCorrida();
                    this.desafiado.ganharCorrida();
                    break;
            }
    }
    
    //getters ans setters

    public Piloto getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Piloto desafiado) {//desafiado do tipo piloto
        this.desafiado = desafiado;
    }

    public Piloto getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Piloto desafiante) {
        this.desafiante = desafiante;
    }

    public int getVoltas() {
        return voltas;
    }

    public void setVoltas(int voltas) {
        this.voltas = voltas;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private static class Randoom extends Random {

        public Randoom() {
        }
    }
    
    
}
