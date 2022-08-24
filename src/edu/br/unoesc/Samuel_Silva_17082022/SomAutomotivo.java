package edu.br.unoesc.Samuel_Silva_17082022;

public class SomAutomotivo {

    private int volumeMaximo;

    private int volumeAtual;
    private boolean somLigado;

    public SomAutomotivo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
            this.somLigado = false;
            this.volumeAtual = 0;
    }

        public boolean ligarSom() {
            if (this.somLigado ||this.volumeAtual!=0)
                return false;

            this.somLigado = true;

            return true;
    }

    public boolean aumetarVolume() {
        if (this.volumeAtual < this.volumeMaximo) {
            this.volumeAtual++;
            return true;
        }
        return false;
    }
    public int getVolumeAtual() {
        return this.volumeAtual;
    }
}

