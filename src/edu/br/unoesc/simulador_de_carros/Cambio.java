package Eduardo_Mortari_17082022;

public class Cambio {
    private Boolean automatico;

    private Integer numerodeMarchas;

    private Integer marchaAtual;

    public Cambio(Boolean automatico, Integer numerodeMarchas) {
        super();
        this.automatico = automatico;
        this.numerodeMarchas = numerodeMarchas;
        this.marchaAtual = 0;
    }



    public Boolean subirMarcha() {
        if (this.marchaAtual < this.numerodeMarchas) {
            this.marchaAtual++;
            return true;
        }
        return false;
    }

    public Boolean reduzirMarcha() {
        if (this.marchaAtual > 0) {
            this.marchaAtual--;
            return true;
        }
        return false;
    }

    public Boolean engatarMarchaRe() {
        if (this.marchaAtual <= this.numerodeMarchas) {
            this.marchaAtual++;
            return true;
        }

        return false;
    }

    public Integer getNumerodeMarchas() {
        return this.numerodeMarchas;
    }

    public Integer getMarchaAtual() {
        return this.marchaAtual;
    }

}
