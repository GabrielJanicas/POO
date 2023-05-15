package aula05.Ex3;

import aula05.Ex1.DateYMD;

public class Imovel {

	int identificador,quartos;
	double preço;
	boolean disponiblidade;
	DateYMD datai,dataf; 
	String localidade;

	public Imovel(int identificador, double preço, String localidade,int quartos) {
		this.identificador = identificador;
		this.preço = preço;
		this.localidade = localidade;
		this.disponiblidade = true;
		this.datai = null;
		this.dataf = null;
		this.quartos = quartos;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public void setQuartos(int quartos){
		this.quartos = quartos;
	}

	public int getQuartos(){
		return this.quartos;
	}

	public double getPreço() {
		return this.preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getLocalidade() {
		return this.localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public boolean isDisponiblidade() {
		return this.disponiblidade;
	}

	public boolean getDisponiblidade() {
		return this.disponiblidade;
	}

	public void setDisponiblidade(boolean disponiblidade) {
		this.disponiblidade = disponiblidade;
	}

	public DateYMD getDatai() {
		return this.datai;
	}

	public void setDatai(DateYMD datai) {
		this.datai = datai;
	}

	public DateYMD getDataf() {
		return this.dataf;
	}

	public void setDataf(DateYMD dataf) {
		this.dataf = dataf;
	}
	@Override
    public String toString() {
        String returnString = "Imóvel: " + this.getIdentificador() + "; quartos: " + this.getQuartos()
                              + "; localidade: " + this.getLocalidade() + "; preço: " + this.getPreço()
                              + "; disponível: " + ( this.getDisponiblidade() ? "sim" : "não" );

        if (this.getDatai() != null && this.getDataf() != null) {
            returnString += "; leilão " + this.getDatai() + " : " + this.getDataf();
        }

        return returnString;
    }
}

