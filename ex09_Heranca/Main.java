public class Main 
{

    public static void main(String[] args) //utilizando os conceitos de herança
    {
        Pessoa p1 = new Pessoa();
        Mecanico p2 = new Mecanico();
        Piloto p3 = new Piloto();
        Chefe p4 = new Chefe();
        
        p1.setNome("Igor");
        p1.setIdade(22);
        p2.setNome("Cleber");
        p3.setNome("Max");
        p4.setNome("Suellen");
        p4.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
