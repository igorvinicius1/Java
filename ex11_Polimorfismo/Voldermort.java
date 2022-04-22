public class Voldermort extends Bruxosdomal
{
    @Override
    public void locomover()
    {
        System.out.println("Voando com a fumaça preta");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Quase nunca come");
    }
    
    @Override
    public String getSeita() {
        return Seita;
    }

    @Override
    public void setSeita(String Seita) {
        this.Seita = Seita;
        System.out.println("SEITA: " + this.getSeita());
    }
    
}
