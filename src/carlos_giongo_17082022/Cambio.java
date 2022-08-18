package carlos_giongo_17082022;

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

    public Boolean subirMarcha(){
        if(this.marchaAtual < this.numeroMarchas){
            this.marchaAtual++;
            return true;
        }
        return false;
    }

    public Boolean reduzirMarcha(){
        if(this.marchaAtual>0){
            this.marchaAtual--;
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
