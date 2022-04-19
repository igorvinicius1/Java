public class Piloto extends Pessoa
{
    private String equipe;
    private int poli = 0; //numero de poli positions na carreira
    private int vitorias = 0; //numero de vitorias
    
    public void Poli()
    {
        this.poli++;
    }
    
    public void Vencer()
    {
        this.vitorias++;
    }
    
    
}
