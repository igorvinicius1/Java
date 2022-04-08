public class Main 
{
    public static void main(String[] args) 
    {
        Carrinho McLaren = new Carrinho();//instanciano um objeto
        McLaren.modelo = "Patati e Patata";//consigo alterar modelo pq é publico
        
        McLaren.cor = "Amarelo"; // Apesar de ser protected na class Carrinho eu posso 
        //mecher pois instanciei um objeto aqui na Main usando essa classe
        
        
        // --->  McLaren.ano = 1999; //Não consigo alterar ano pq ele é private
        
        // --->  McLaren.ligado(); //Não acessa metodos privador
        
        McLaren.desligado();
        McLaren.status();//chama o método
    }
}
