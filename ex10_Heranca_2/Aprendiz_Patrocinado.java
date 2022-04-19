package com.mycompany.heranca_2;

public class Aprendiz_Patrocinado extends Aprendiz //vai ter tudo oq a class aprendiz tem  
{
    private float patrocinio;
    
    public void renoPatrocinio()
    {
        System.out.println("Os patrocinadores renovaram o patrocinio do aprendiz: " + this.getNome());
    }
    
    @Override // o método "Pagar" se encontra na class "Aprendiz" portanto vou utiliza-la nessa classe tbm, basta dar um @override
    public void Pagar()
    {
        System.out.println(this.getNome() + " acabou de pagar com os patrocinadores !!!");
    }
    
    
}
