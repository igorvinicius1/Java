public class Mecanico extends Pessoa //nome do herdeiro a esquerda e da mãe a direita
{
    private boolean trabalhando;
    private String setor;

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
