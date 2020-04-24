class ListaLigada {
	public Celula primeiro;
	public Celula ultima;
	private int total = 0;

	public int tamanho(){
		return total;
	}

	public void adiciona(int posicao, rodovia elemento){
		if (posicao == 0){
			this.adicionaNoComeco (elemento);
		}
		else if (posicao == this.total){
			this.adicionaNoFim(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);

            total++;
		}
	}

	 public void adicionaNoFim(rodovia elemento) {
        if (tamanho() == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            nova.setAnterior(ultima);
			this.ultima.setProxima(nova);
            this.ultima = nova;

            total++;
        }
    }
	public void adicionaNoComeco(rodovia elemento){

		if (tamanho() == 0) {
            Celula nova = new Celula(elemento);
            this.primeiro = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeiro, elemento);
            this.primeiro.setAnterior(nova);
            this.primeiro = nova;
        }

        total++;
	}
	public String toString(){
		if (total == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeiro;

		for (int i = 0; i<this.total-1; i++){
			builder.append(atual.getElemento().Kilometro);
			builder.append(", ");
			builder.append(atual.getElemento().link_url);
			builder.append(", ");
			atual = atual.getProxima();
		}
		builder.append(atual.getElemento().Kilometro);
		builder.append(";");
		builder.append(atual.getElemento().link_url);
		builder.append("]");
		return builder.toString();
	}

	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao<this.total;
	}

	public rodovia pega (int posicao){
		return (pegaCelula(posicao).getElemento());
	}

	public Celula pegaCelula(int posicao){
		if (!posicaoOcupada(posicao))
		{throw new IllegalArgumentException("posição não existe");}
		Celula atual = this.primeiro;
		for(int i = 0; i<posicao-1; i++){
			atual = atual.getProxima();
		}
		return atual;
	}

	public void removeDoComeco(){
		if (!posicaoOcupada(0)){
			throw new IllegalArgumentException("posição não existe");
		}
		this.primeiro=primeiro.getProxima();
		total=total-1;
		if (total==0){
			this.ultima = null;
		}
	}
}