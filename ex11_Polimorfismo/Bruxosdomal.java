public class Bruxosdomal extends Bruxo
{
    protected String Seita;
    
    @Override
    public void locomover() {
        System.out.println("Fumaça preta que risca o ceu");
    }

    @Override
    public void alimentar() {
        System.out.println("Comidas usuais e outras nem tão usuais assim...");
    }

    @Override
    public void enfeiticar() {
        System.out.println("Avada Kedarva !!!");
    }

    public String getSeita() {
        return Seita;
    }

    public void setSeita(String seita) {
        this.Seita = seita;
    }
    
}
