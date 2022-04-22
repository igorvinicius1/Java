public class Bruxosdobem extends Bruxo
{
    protected String alianca;
    
    @Override //quando herdo a classe Bruxos a classe atual já pede para implementar os metodos abstratos
    public void locomover() {
        System.out.println("Aparatando, voando de vassoura, chave de portal");
    }

    @Override
    public void alimentar() {
        System.out.println("Suco de abóbara, feijõezinhos de todos os sabores, sapo de cholate");
    }

    @Override
    public void enfeiticar() {
        System.out.println("Expeliarnus !!!");
    }

    public String getAlianca() {
        return alianca;
    }

    public void setAlianca(String alianca) {
        this.alianca = alianca;
    }
     
    
}
