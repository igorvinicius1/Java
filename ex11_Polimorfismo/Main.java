public class Main {

    public static void main(String[] args) 
    {
        Bruxosdobem b = new Bruxosdobem(); //não posso instanciar "Bruxo" pq a classe é abstrata, apenas instanciar as filhas
        b.locomover();
        
        HarryPotter hp = new HarryPotter();
        hp.locomover();
        hp.enfeiticar();
        hp.setAlianca("Armada de Dumbleodore");
        System.out.println("\n\n");
        Voldermort vol = new Voldermort();
        vol.locomover();
        vol.enfeiticar();
        vol.setSeita("Comensais da Morte");
        System.out.println("\n\n");
        Bicusso bi = new Bicusso();
        bi.alimentar();
        bi.Comer();
        bi.locomover();
        
        
    }
    
}
