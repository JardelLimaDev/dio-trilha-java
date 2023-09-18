package tiposVariaveis;

public class Usuario {
	
	public static void main(String[] args) {
		
		SmartTV smartTv = new SmartTV();
		//inicial
		System.out.println("A TV esta ligada ? " + smartTv.ligada);
		System.out.println("A TV esta em qual canal ? " + smartTv.canal);
		System.out.println("A TV esta em qual volume ? " + smartTv.volume);
		 
		System.out.println("------------------------------------------");
		//alterando comportamento
		smartTv.ligar();
		System.out.println("A TV esta ligada ? " + smartTv.ligada);
		smartTv.mudarCanal(20);
		System.out.println("A TV esta em qual canal ? " + smartTv.canal);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();

		
	}
	
	
	
	
	
	

}
