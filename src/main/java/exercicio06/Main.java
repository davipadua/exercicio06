package exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
//		List<String> carros = new ArrayList<String>();
//		carros.add("civiv");
//		carros.add("gol");
//		carros.add("palio");
//		carros.add("uno");
		
//		for (String carro: carros) {
//			System.out.println(carro);
//		}
		
//		for (String carro: carros) {
//			if(carro.equals("gol")) {
//				carro = "l200";
//			}
//		}
//		
//		for (String carro: carros) {
//			System.out.println(carro);
//		}
		
		String[] carros = new String[4];
		carros[0] = "civic";
		carros[1] = "gol";
		carros[2] = "palio";
		carros[3] = "uno";
		
		for(int k = 0; k < carros.length; k++) {
			System.out.println(carros[k]);
		}
		
		
		for(int i = 0; i < carros.length; i++) {
			if(carros[i].equals("gol")) {
				carros[i] = "l200";
			}
		}
		
		for(int k = 0; k < carros.length; k++) {
			System.out.println(carros[k]);
		}
		
		
		}
		
	}

