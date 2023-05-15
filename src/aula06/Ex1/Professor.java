package aula06.Ex1;

import aula07.Ex2.DateYMD;

public class Professor extends Pessoa{
	private int nMec;
	private String cargo;
	private String departamento;

	public Professor(String name,int nMec,DateYMD dataInst ,String cargo,String departamento){
		super(name, nMec, dataInst);
		this.cargo= cargo;
		this.departamento = departamento;
	}
	public int getNMec() {
		return this.nMec;
	}

	public void setNMec(int nMec) {
		this.nMec = nMec;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
    public String toString() {
        return "Professor{" + "nMec=" + nMec + ", cargo=" + cargo + " ,departamento="+departamento+'}';
    }
}
