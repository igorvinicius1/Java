package com.mycompany.heranca_2;

public class Aprendiz extends Pessoa
{
    private String equipe;
    private float mensalidade;

    public void Pagar()
    {
        System.out.println("O piloto aprendiz: " + this.getNome() + "pagou a mensalidade de R$ " + this.getMensalidade());
    }
    
    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Aprendiz{" + "equipe=" + equipe + ", mensalidade=" + mensalidade + '}';
    }
    
    
    
}
