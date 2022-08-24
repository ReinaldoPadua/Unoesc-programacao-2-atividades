package Arthur_Freddo_17082022;

public class Cambio {

    private Boolean automatico;

    private Integer numeroMarchas;

    private Integer marchaAtual;

    public Cambio(Boolean automatico,Integer numeroMarchas){
        super();
        this.automatico = automatico;
        this.numeroMarchas = numeroMarchas;
        this.marchaAtual = 0;
    }

    public boolean subirMarcha(){
        for(int i = 1; i <=5; ++i)
        {
            if(this.marchaAtual >= 0 && this.marchaAtual <= 4){
                this.marchaAtual++;
            }else break;
            return true;
        }
        return false;
    }

    public boolean reduzirMarcha(){
        for(int i = 5; i > 0; --i)
        {
            if(this.marchaAtual > 0){
                this.marchaAtual--;
            }else break;
            return true;
        }
        return false;
    }

    public Boolean engatarMarchaRe(){
        if(this.marchaAtual<=this.numeroMarchas){
            this.marchaAtual++;
            return true;
        }

        return false;
    }

    public Integer getNumeroMarchas() {
        return this.numeroMarchas;
    }

    public Integer getMarchaAtual() {
        return this.marchaAtual;
    }


}
