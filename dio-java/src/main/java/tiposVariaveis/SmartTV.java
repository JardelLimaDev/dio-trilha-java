package tiposVariaveis;

public class SmartTV {
	
	boolean ligada = false;
	int canal = 12;
	int volume = 20;
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	public void aumentarCanal() {
		canal ++;
	}
	public void diminuirCanal() {
		canal --;
	}
	
	public void aumentarVolume() {
		volume ++;
		System.out.println("Volume + " + volume);
	}
	public void dimunuirVolume() {
		volume --;
	}
	
	
	
	
	

}
