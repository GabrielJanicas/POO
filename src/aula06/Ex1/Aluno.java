package aula06.Ex1;

import java.time.LocalDate;
import aula07.Ex2.DateYMD;

public class Aluno extends Pessoa {
    private static int nMecCount = 100;
    private final int nMec;
    private DateYMD dataInst;

    public Aluno(String name, int cc, DateYMD nascdaDate, DateYMD dataInst) {
        super(name, cc, nascdaDate);
        this.nMec = nMecCount++;
        this.dataInst = dataInst;
    }

    public Aluno(String name, int cc, DateYMD nascdaDate) {
        super(name, cc, nascdaDate);
        this.nMec = nMecCount++;
        this.dataInst = getCurrentDate();
    }

    public DateYMD getdataInst() {
        return dataInst;
    }

    public void setdataInst(DateYMD dataInst) {
        this.dataInst = dataInst;
    }

    public int getnMec() {
        return nMec;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nMec=" + nMec + ", dataInsc=" + dataInst + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        final Aluno other = (Aluno) obj;
        return this.nMec == other.nMec && this.dataInst.equals(other.dataInst) && super.equals(obj);
    }

    private DateYMD getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return new DateYMD(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
    }

}
