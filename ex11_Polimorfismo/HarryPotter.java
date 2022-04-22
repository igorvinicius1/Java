public class HarryPotter extends Bruxosdobem
{
    @Override//sobre pondo o método da classe do bruxo do bem
    public void locomover()
    {
        System.out.println("Voando com a Ninbus 2001");   
    } 
    
    @Override
    public String getAlianca() {
        return alianca;
    }

    @Override
    public void setAlianca(String alianca) {
        this.alianca = alianca;
        System.out.println("ALIANÇA: " + this.getAlianca());
    }
   
}
