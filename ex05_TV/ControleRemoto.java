public class ControleRemoto implements Controlador
{
    private int volume;
    private boolean ligado;
    private boolean tocando; //"passando"
    
    // construtor
    public ControleRemoto() //o objeto já vai começar com essas caracteristicas
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //getter and setter
    private int getVolume() {
        return volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos que usam a interface 

    @Override//sob escrever
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--- MENU ---");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true)
        {
            this.setVolume(this.getVolume() + 5);
        }
        else
        {
            System.out.println("TV está desligada");
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true)
        {
            this.setVolume(this.getVolume() - 5);
        }
        else
        {
            System.out.println("TV está desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0)
        {
            this.setVolume(this.getVolume()+50);
        }
        else
        {
            System.out.println("A TV não está no Mudo");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && !(this.getTocando() == true)) //"!" singifica não
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() == true && !(this.getTocando() == false)) //&& get tocando não seja true
        {
            this.setTocando(false);
        }
    }  
}
