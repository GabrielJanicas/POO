package aula05.Ex3;

import java.util.ArrayList;

import aula05.Ex1.DateYMD;

public class RealEstate {

	private static int identificador = 1000;
	ArrayList<Imovel> propriedades = new ArrayList<Imovel>();

	public Imovel newProperty(String localidade,int quartos,double preço){

		Imovel imovel = new Imovel(identificador,preço,localidade,quartos );
		identificador ++;
		propriedades.add(imovel);
		return imovel;

	}

	public void sell(int numero){
		if(numero < identificador){
			for(int i = 0;i < propriedades.size();i++ ){
				Imovel imovel = propriedades.get(i);
				int identificador = imovel.getIdentificador();

				if(numero == identificador){
					if(imovel.getDisponiblidade() == true){
						System.out.println("Imóvel "+ numero +" vendido");
						imovel.setDisponiblidade(false);
						return;
					}
					else{
						System.out.println("Imóvel "+ numero +"não está disponivel");
						return;
					}
				}
			}
		}
		System.out.println("Imóvel "+ numero +"não existe");
	}

	public void setAuction(int numero, DateYMD datai, int incremento) {
		if(numero < identificador){
			for(int i = 0;i < propriedades.size();i++ ){
				Imovel imovel = propriedades.get(i);
				int identificador = imovel.getIdentificador();

				if(numero == identificador){
					imovel.setDatai(datai);
					datai.increment(incremento);
					imovel.setDataf(datai);
				}
			}
	}
}
@Override
    public String toString() {
        String returnString = "Propriedades:\n";
        for (Imovel i : propriedades) {
            returnString += i + "\n";
        }
        return returnString;
    }
}

