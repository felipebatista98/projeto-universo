package controle;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.Asteroide;
import dominio.Cometa;
import dominio.CorpoCeleste;
import dominio.Galaxia;
import dominio.Meteorito;
import dominio.Meteoro;
import dominio.Meteoroide;
import dominio.Nebulosa;
import dominio.Planeta;
import dominio.Satelite;
import dominio.Sistema;
import dominio.Universo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		char r ;
		// Objetos das classes instanciados aqui
		Universo uni = null;
		Galaxia galaxia = null;
		Sistema sistema = null;
		Nebulosa nebulosa = null;
		
		// Atributos da classe abstrata CorpoCeleste
		String nome;
		double massa = 0;
		double densidade = 0;
		double diametro = 0;
		String composição;
		double tamanho;
		System.out.println("+++++++++++++++UNIVERSO+++++++++++++++");
		System.out.print("Digite o nome do universo: ");
		String descricaoUni = sc.nextLine();
		uni = new Universo(descricaoUni);
				
		do {

			//ADC Galaxia
			System.out.println("\n========Digite informações da Galaxia========");
			System.out.print("Digite o nome da galáxia: ");
			String descricaoGalaxia = sc.nextLine();
			
			galaxia = new Galaxia(descricaoGalaxia);
			uni.adGalaxia(galaxia);
			
			//ADC Sistema
			System.out.println("\n========Digite informações do Sistema========");
			System.out.print("Digite o nome do sistema: ");
			String nomeSistema = sc.nextLine();
			System.out.print("Digite anos Aprox do sistema: ");
			int anosSistema = sc.nextInt();sc.nextLine();
			sistema = new Sistema(nomeSistema, anosSistema);
			galaxia.adSistema(sistema);

			//ADC Nebulosa
			System.out.println("\n========Digite informações da Nebulosa========");
			System.out.print("Digite o Tipo de nebulosa: ");
			String tipoNebulosa = sc.nextLine();
			System.out.print("Digite o nome da nebulosa: ");
			String nomeNebulosa = sc.nextLine();
			nebulosa = new Nebulosa(tipoNebulosa, nomeNebulosa);
			uni.adNebulosa(nebulosa);

			//Adc Planeta
		
			System.out.println("\n========Digite informações do Planeta========");
			System.out.print("Digite nome do planeta: ");
			nome = sc.nextLine();
			System.out.print("Digite tipo atmosfera do planeta: ");
			String atmosferaPlaneta = sc.nextLine();
			System.out.print("Digite massa do planeta: ");
			massa = sc.nextDouble();
			System.out.print("Digite densidade planeta: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do planeta: ");
			diametro = sc.nextDouble();
			System.out.print("Digite a força gravitacional do planeta: ");
			double forcaGPlaneta = sc.nextDouble();
			System.out.print("Digite o periodo de rotação do planeta: ");
			double periodoRotacao = sc.nextDouble();
			System.out.print("Digite a quantidade de satelites: ");
			int quantSatelites = sc.nextInt();
			Planeta planeta = new Planeta(massa, densidade, diametro, nome, atmosferaPlaneta, forcaGPlaneta, periodoRotacao, quantSatelites);
			sistema.adCorpoCeleste(planeta);
			
			//ADC Asteroide
			System.out.println("\n========Digite informações do Asteroide========");
			System.out.print("Digite a massa do asteroide: ");
			massa = sc.nextDouble();sc.nextLine();
			System.out.print("Digite o nome do asteroide: ");
			nome = sc.nextLine();
			System.out.print("Digite a densidade do asteroide: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do asteroide");
			diametro = sc.nextDouble();sc.nextLine();
			System.out.print("Digite a composição do asteroide: ");
			String composicaoAsteroide = sc.nextLine();
			Asteroide asteroide = new Asteroide(diametro,massa, densidade, nome, composicaoAsteroide); 
			sistema.adCorpoCeleste(asteroide);	

			//ADC Cometa
			System.out.println("\n========Digite informações do cometa========");
			System.out.print("Digite o nome do Cometa: ");
			nome = sc.nextLine();
			System.out.print("Digite a massa do Cometa: ");
			massa = sc.nextDouble();
			System.out.print("Digite a densidade do Cometa: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do Cometa: ");
			diametro = sc.nextDouble();sc.nextLine();
			System.out.print("Digite a composição do cometa: ");
			String composicaoCometa = sc.nextLine();
			System.out.print("Digite o tipo de orbita do cometa: ");
			String tipoOrbita = sc.nextLine();
			Cometa cometa = new Cometa(diametro,massa, densidade, nome, composicaoCometa, tipoOrbita);
			sistema.adCorpoCeleste(cometa);

			//ADC Satelite 
			System.out.println("\n========Digite informações do satelite========");
			System.out.print("Digite o nome do satelite: ");
			nome = sc.nextLine();
			System.out.print("Digite a massa do satelite: ");
			massa = sc.nextDouble();
			System.out.print("Digite a densidade do satelite: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do satelite: ");
			diametro = sc.nextDouble();
			System.out.print("Digite o periodo orbital do Satelite: ");
			double periodoOrbital = sc.nextDouble();sc.nextLine();
			System.out.print("Digite data de descoberta do Satelite: ");
			String dataDescoberta = sc.nextLine();
			Satelite satelite = new Satelite(massa, densidade, diametro, nome, periodoOrbital, dataDescoberta);
			sistema.adCorpoCeleste(satelite);
			
			//ADC Meteoroide
			System.out.println("\n========Digite informações do meteoroide========");
			System.out.print("Digite o nome do meteoroide: ");
			nome = sc.nextLine();
			System.out.print("Digite a massa do meteoroide: ");
			massa = sc.nextDouble();
			System.out.print("Digite a densidade do meteoroide: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do meteoroide: ");
			diametro = sc.nextDouble();
			System.out.print("Digite o tamanho do meteoroide: ");
			tamanho = sc.nextDouble();sc.nextLine();
			System.out.print("Digite a composição do meteoroide:");
			composição = sc.nextLine();
			Meteoroide meteoroide = new Meteoroide(massa, densidade, diametro, nome, tamanho, composição);
			sistema.adCorpoCeleste(meteoroide);
			
			//ADC Meteoro
			System.out.println("\n========Digite informações do meteoro========");
			System.out.print("Digite o nome do meteoro: ");
			nome = sc.nextLine();
			System.out.print("Digite a massa do meteoro: ");
			massa = sc.nextDouble();
			System.out.print("Digite a densidade do meteoro: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do meteoro: ");
			diametro = sc.nextDouble();
			System.out.print("Digite o tamanho do meteoro: ");
			tamanho = sc.nextDouble();sc.nextLine();
			System.out.print("Digite a composição do meteoro:");
			composição = sc.nextLine();
			System.out.print("Digite o tipo de meteoro: ");
			String tipoMeteoro = sc.nextLine();
			Meteoro meteoro = new Meteoro(massa, densidade, diametro, nome, tamanho, composição, tipoMeteoro);
			sistema.adCorpoCeleste(meteoro);
			
			//ADC Meteorito
			System.out.println("\n========Digite informações do meteoro========");
			System.out.print("Digite o nome do meteorito: ");
			nome = sc.nextLine();
			System.out.print("Digite a massa do meteorito: ");
			massa = sc.nextDouble();
			System.out.print("Digite a densidade do meteorito: ");
			densidade = sc.nextDouble();
			System.out.print("Digite o diametro do meteorito: ");
			diametro = sc.nextDouble();
			System.out.print("Digite o tamanho do meteorito: ");
			tamanho = sc.nextDouble();
			String tipoMeteorito = sc.nextLine();
			Meteorito meteorito = new Meteorito(massa, densidade, diametro, nome, tamanho, composição, tipoMeteorito);
			sistema.adCorpoCeleste(meteorito);
			
			System.out.println("\n================================================================");
			System.out.println("Para visualizar os itens inseridos diginte N para continuar S");
			System.out.println("------------++++ Deseja continuar? <S/N> ++++------------");
			System.out.print("====================================================================\n");
			r=sc.next().charAt(0);
			sc.nextLine();
			
		}while(r=='S');
		
		if(r=='N') {
		ArrayList<Galaxia> listaGalaxy = uni.getListaGal();
		ArrayList<Nebulosa> listaNebulosa = uni.getListaNeb();
		ArrayList<Sistema> listaSystem = galaxia.getListaSistema();
		ArrayList<CorpoCeleste> listaCorpo = sistema.getListacorpoCeleste();
			System.out.println("===========Universo Cadastrado==========");
			System.out.println("Universo cadastrado: " + uni.getDescricaoUni());
			System.out.println("\n==========Nebulosas Cadastradas=========");
			for(Nebulosa objNeb: listaNebulosa){			
				System.out.println("Nebulosa Cadastrada: " + objNeb.getNomeNebulosa());
			}
		
			System.out.println("\n==========Galáxias Cadastradas=========");
			for(Galaxia objGalaxy: listaGalaxy){
				System.out.println("Galaxia Cadastrada: " + objGalaxy.getDescricaoGalaxia());
			}
		
			System.out.println("\n==========Sistemas Cadastrados=========");
			for(Sistema objsist: listaSystem){
				System.out.println("Sistema Cadastrado: " + objsist.getNomeSistema());
			}
		
			System.out.println("\n=======Corpos celestes Cadastrados======");
			for(CorpoCeleste obj: listaCorpo){
				System.out.println("Corpos celeste cadastrado: " + obj.getNome());
			}
		}
		
	}



}
