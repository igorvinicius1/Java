public class Main 
{
    public static void main(String[] args) 
    {
        ControleRemoto c = new ControleRemoto();
        /*c.ligar()
        c.maisVolume();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.menosVolume();
        c.pause();
        c.desligar();
        c.menosVolume();
        c.abrirMenu();*/
        
        c.ligar();
        c.pause();
        c.play();
        c.pause();
        c.maisVolume();
        c.abrirMenu();
    }  
}
