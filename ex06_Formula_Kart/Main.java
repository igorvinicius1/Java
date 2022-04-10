public class Main 
{
    public static void main(String[] args) 
    {
        //Piloto p = new Piloto("Igor", "BR", 22, 73.5f, 5);
        
        Piloto p[] = new Piloto[5]; //vetor que armazena 5 pilotos de uma vez "Objetos compostos"
        
        p[0] = new Piloto("Igor", "BR", 22, 73.5f, 5);
        p[1] = new Piloto("Verstappen", "HOL", 24, 75.5f, 11);
        p[2] = new Piloto("Hamilton", "UK", 34, 70.5f, 103);
        p[3] = new Piloto("Vettel", "GER", 38, 76.5f, 28);
        p[4] = new Piloto("Raikkonen", "FIN", 41, 83.5f, 17);
        
        int i;
        
        for(i = 0; i < 6; i++)
        {
            p[i].apresentar();
            p[i].status();
        }
        
        System.out.println("\n --- FIM DA APRESENTAÇÃO ---\n");
    }   
}
