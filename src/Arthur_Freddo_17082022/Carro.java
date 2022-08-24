package Arthur_Freddo_17082022;

public class Carro {

    private String modelo;

    private String fabricante;

    private Integer ano;

    private Cambio cambio;

    private Double velocidadeMaxima;

    private Double velocidadeAtual;

    private Boolean temCombustivel;

    private Boolean ligado;

    // construtor para exibir informações do corsa
    public Carro(String modelo, String fabricante, Integer ano, Cambio cambio, Double velocidadeMaxima){
        super();
        this.modelo=modelo;
        this.fabricante= fabricante;
        this.ano=ano;
        this.cambio=cambio;
        this.velocidadeMaxima= 220.00;
        this.velocidadeAtual=0.00;
        this.temCombustivel=true;
        this.ligado=false;
    }

    public Boolean ligar(){
        if(this.ligado.equals(true)||this.temCombustivel.equals(false) || this.cambio.getMarchaAtual()!=0)
            return false;

        this.ligado=true;

        return true;
    }

    public Boolean desligar(){
        if(this.ligado.equals(false) && this.cambio.getMarchaAtual()!=0)
            return false;

        this.velocidadeAtual=0.00;
        this.ligado = false;

        return  true;
    }

    public Double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public Boolean acelerar(){
        while(this.ligado.equals(true)&&this.velocidadeAtual<this.velocidadeMaxima && this.validarTrocaMarcha()
                && this.cambio.getMarchaAtual()!=0 && cambio.getMarchaAtual() <= 5){

            this.velocidadeAtual += this.retornarVelocidadeMaximaPorMarcha();
            return true;


        }return false;
    }

    public Boolean freiar(){
        while(this.cambio.getMarchaAtual()>=0 && cambio.getMarchaAtual() <= 5){

            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
            return false;


        }return true;
    }

    private Boolean validarTrocaMarcha() {
        return this.velocidadeAtual < this.retornarVelocidadeMaximaPorMarcha() * this.cambio.getMarchaAtual();
    }

    private Double retornarVelocidadeMaximaPorMarcha(){
        return this.velocidadeMaxima/this.cambio.getNumeroMarchas();
        // Se numero de marchas == 5 numero é fixo em 44km/h a cada marcha
    }

    private void frear(){
        if(this.velocidadeAtual>0){
            this.velocidadeAtual -= this.retornarVelocidadeMaximaPorMarcha();
        }
    }


}

