package aula06.Ex1;
import aula07.Ex2.DateYMD;

public class Bolseiro extends Aluno {
    private float valorBolsa;
    private int nMec;
    private Professor orientador;

    public Bolseiro(String nome, int nMec, DateYMD dataNasc,Professor orientador,float valorBolsa) {
        super(nome, nMec, dataNasc);
        this.valorBolsa = valorBolsa;
        this.nMec = nMec;
        this.orientador = orientador;
    }


    public Professor getOrientador(){
        return this.orientador;
    }

    public void setOrientador(Professor orientador){
        this.orientador = orientador;
    }

    public float getValorBolsa() {
        return this.valorBolsa;
    }

    public void setValorBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    public int getNMec() {
        return this.nMec;
    }

    public void setNMec(int nMec) {
        this.nMec = nMec;
    }

    public float getBolsa() {
        return valorBolsa;
    }

    public void setBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Override
    public String toString() {
        return "Bolseiro{" + "valorBolsa=" + valorBolsa + '}';
    }

}
