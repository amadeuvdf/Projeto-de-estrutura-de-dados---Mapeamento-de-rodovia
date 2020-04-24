public class Celula{
	 Celula proxima;
	 rodovia elemento;
	 Celula anterior;

	Celula (Celula proxima, rodovia elemento){
		this.proxima = proxima;
		this.elemento = elemento;
	}
	Celula (rodovia elemento){
		this.elemento = elemento;
	}
	public void setProxima(Celula proxima){
		this.proxima = proxima;
	}
	public void setAnterior(Celula anterior){
		this.anterior = anterior;
	}
	public Celula getProxima(){
		return this.proxima;
	}
	public rodovia getElemento(){
		return this.elemento;
	}
}