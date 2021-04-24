package main;

import java.util.ArrayList;
import java.util.Scanner;

public class APS_POO_4SEM {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int xInicial = 0;
		int yInicial = 0;
		Character input = ' ';
		Character inputOut = ' ';
		ArrayList<ArrayList<Integer>> labirinto = Labirinto.gerarLabirinto();
		
		Homenzinho homem = new Homenzinho( labirinto, xInicial, yInicial );
		
		while(inputOut != 'N')
		{
			Labirinto.mostrarLabirinto( labirinto, homem.getCaminhoAndadoX(), homem.getCaminhoAndadoY() );
			
			System.out.println("Selecione qual parede voce deseja tocar: [W, A, D, S]");
			System.out.println("W -> FRENTE");
			System.out.println("A -> ESQUERDA");
			System.out.println("D -> DIREITA");
			System.out.println("S -> TRAS");
			
			input = scn.next().charAt(0);
			input = Character.toUpperCase(input);
			
			// Tratamento de erro caso o homem tente andar fora do labirinto.
			try 
			{
				if (homem.tocarParede(input) == 0)
					System.out.println("Nao tem uma parede");
				else
					System.out.println("Tem uma parede");
			}
			catch(Exception ex)
			{
				System.out.println("A parte que voce tocou esta fora do labirinto.");
			}
			
			System.out.println("Deseja dar um passo: [S, N]");
			
			input = scn.next().charAt(0);
			input = Character.toUpperCase(input);
			
			if ( input == 'S')
			{
				// Implementar Input
				System.out.println("Deseja ir para qual lado: [W, A, D, S]");
				System.out.println("W -> FRENTE");
				System.out.println("A -> ESQUERDA");
				System.out.println("D -> DIREITA");
				System.out.println("S -> TRAS");
				
				input = scn.next().charAt(0);
				input = Character.toUpperCase(input);
				
				// Tratamento de erro caso o homem tente andar fora do labirinto.
				try 
				{
					if (homem.tocarParede(input) == 0)
						homem.Andar(input);
					else
						System.out.println("Ouch! Bati em uma parede!");
				}
				catch(Exception ex)
				{
					System.out.println("A parte que voce tocou esta fora do labirinto.");
				}
				
			}
			
			System.out.println("Voce deseja sair do labirinto? [S/N]");
			inputOut = scn.next().charAt(0);
			inputOut = Character.toUpperCase(input);
		}
		
		scn.close();
	}

}
