package aula06.Ex1;

import aula07.Ex2.DateYMD;

public class Pessoa {
    private String name;
    private int cc;
    private DateYMD dataNasc;

    public Pessoa(String name, int cc, aula07.Ex2.DateYMD nascdaDate) {
        this.name = name;
        this.cc = cc;
        this.dataNasc = nascdaDate;
    }
    public Pessoa(String name,DateYMD dataNasc) {
        this.name =name;
        this.dataNasc = dataNasc;
    }

    public Pessoa(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCc() {
        return cc;
    }

    public DateYMD getDateNascDate() {
        return dataNasc;
    }
public void setName(String name){
    this.name = name;
}
public void setCc(int cc){
    this.cc = cc;
}
public void setDataNasc(DateYMD dataNasc){
    this.dataNasc = dataNasc;
}
@Override
public String toString() {
    return "Pessoa{" + "name=" + name + ", cc=" + cc + ", dataNasc=" + dataNasc + '}';
}

@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
        result = prime * result + cc;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}