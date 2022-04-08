package com.mycompany.corretora;

public class ContaCorretora 
{
    private int numconta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private float dividendos;
    private float dep;
    
    public void situacao()
    {
        System.out.println("--------------------------");
        System.out.println("Numero da conta: " + this.getNumconta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Dividendos R$ " + this.getDividendos());
    }
    
    //métodos
    
    public void abrirConta(String t)
    {
        this.setTipo(t);
        this.setStatus(true);
        
        if(t == "Renda fixa")
        {
            this.setSaldo(50);
        }
        else if(t == "Renda variável")
        {
            this.setSaldo(100);
        }
        else
        {
            System.out.println("Esse tipo de conta está insdisponível senhorita: " + this.getDono());
            this.setTipo("null");
        }
    }
    
    public void fecharConta()
    {
        if(this.getSaldo() > 0)
        {
            System.out.println("A conta não pode ser fechado pois o saldo ainda é positivo");
        }
        else if(this.getSaldo() < 0)
        {
            System.out.println("Há débito na conta, impossível fechar conta");
        }
        else //saldo = 0
        {
            this.setStatus(false);
            System.out.println("Conta fechada !");
        }      
    }
    
    public void depositar(float v)
    {
        this.setDep(v);
        
        if(this.getStatus() == true)
        {
            this.setSaldo(this.getSaldo() + v); //já acrescenta o valor "v" ao atributo "saldo" utilizando o método set
            System.out.println("Depósito feito na conta de: " + this.getDono() + " valor do depósito R$ " + this.getDep());
        }
        else
        {
            System.out.println("Não é possível depositar nessa conta");
        }
    }
    
    public void sacar(float v)
    {
        if(this.getStatus() == true)//se a conta estiver ativa
        {
            if(this.getSaldo() >= v)
            {
                this.setSaldo(this.getSaldo() - v); //subtrai do saldo o valor sacado
                System.out.println("Saque na conta de: " + this.getDono());
            }
            else
            {
                System.out.println("Saldo insuficiente");
            }
        }
        else
        {
            System.out.println("Conta inexistente");
        }
    }
    
    public void receber(float valor)
    {
        this.setDividendos(valor);//guarda o saldo dos dividendos no atributo com o método set
        
        if(this.getStatus())
        {
            this.setSaldo(this.getSaldo() + valor); //valor dos dividendos sendo acrescentados ao saldo
            System.out.println("Dividendos / Rendimentos de R$" + this.getDividendos() + " pagos para: " + this.getDono());
        }
        else
        {
            System.out.println("Conta inexistente");
        }
    }
    
    //construtor

    public ContaCorretora()//construtor determina que começa assim 
    {
        this.saldo = 0;
        this.status = false;
    }
    
    //métodos de acesso

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getDividendos() {
        return dividendos;
    }

    public void setDividendos(float dividendos) {
        this.dividendos = dividendos;
    }   

    public float getDep() {
        return dep;
    }

    public void setDep(float dep) {
        this.dep = dep;
    }
    
    
}
