public class Piloto 
{
    private String nome;
    private String nacionalidade;
    private int idade;
    private String categoria;
    private float peso;
    private int vitorias;
    
    //métodos
    public void apresentar()
    {
        if(getPeso() >= 60)
        {
            System.out.println("---- APRESENTAÇÃO ----");
            System.out.println("Piloto: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nPaís: " + this.getNacionalidade());
        }
        else
        {
            System.out.println("Só é permitido pilotos a partir de 60 Kg");
        }
        
    }
    
    public void status()
    {
        if(getPeso() >= 60)
        {
            System.out.println("---- STATUS ----");
            System.out.println("Categoria: " + this.getCategoria() + "\nPeso: " + this.getPeso() + " Kg" + "\nVitórias: " + this.getVitorias());
        }
        else
        {
            System.out.println("Sem status");
        }   
    }
    
    public void ganharCorrida()
    {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderCorrida()
    {
        setVitorias(getVitorias() + 0);
    }
    
    //construtor
    public Piloto(String nome, String nacionalidade, int idade, float peso, int vitorias) 
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);//entra no set que adciona o peso e já determina a categoria
        this.vitorias = vitorias;
    }
    
    //getter and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() <= 60.0)
        {
            this.categoria = "Só pilotos a partir de 60 Kg";
        }
        else if(this.getPeso() <= 72.0)
        {
            this.categoria = "Leve";
        }
        else
        {
            this.categoria = "Pesado";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;//guarda o peso
        this.setCategoria();//chama categoria para defini-la a partir do peso fornecido
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    
}
