public class Carrinho 
{
    public String marca; //todas as classes tem acesso ao atributo
    public String modelo; //todas as classes tem acesso ao atributo
    private int ano; //apenas essa classe tem acesso
    protected boolean ignicao; //atributo
    protected String cor;
    
    
    private void ligado() //método que liga o carro
    {
        this.ignicao = true;
    }
    
    void desligado() //método que desliga o carro
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
        System.out.println("Cor: " + this.cor);
    }
}
