public class selecao{

	public static int primeiroSelecao (ListaLigada pSeq,int pInicio, int pFim, int pVal){

		for (int indice = pInicio; indice<=pFim; indice++){
			int valor = pSeq.pega(indice).Kilometro;
			if (valor <= pVal) {
					return indice;
			}
		}
		return -1;
	}

	public static int melhorSelecao(ListaLigada pSeq, int pVal){
		int pInicio = 0;
		int pFim = pSeq.tamanho()-1;
		int melhor = primeiroSelecao (pSeq,pInicio,pFim,pVal);
		if (melhor == -1)
			return -1;
		for (int indice = melhor +1 ; indice <= pFim; indice++){
			int valor = pSeq.pega(indice).Kilometro;
			int valor_melhor = pSeq.pega(melhor).Kilometro;
			if ( valor > valor_melhor && valor <= pVal)
				melhor = indice;
		}
		return melhor;
	}
}