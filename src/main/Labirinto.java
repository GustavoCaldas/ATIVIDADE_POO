package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public abstract class Labirinto {
	
	private static ArrayList<ArrayList<Integer>> labirinto1 = new ArrayList<ArrayList<Integer>>(20);
	private static ArrayList<ArrayList<Integer>> labirinto2 = new ArrayList<ArrayList<Integer>>(20);
	private static ArrayList<ArrayList<Integer>> labirinto3 = new ArrayList<ArrayList<Integer>>(20);
	private static ArrayList<ArrayList<Integer>> labirinto4 = new ArrayList<ArrayList<Integer>>(20);
	
	public static ArrayList<ArrayList<Integer>> gerarLabirinto() {
		
		// Gerar Numero Aleatorio 1 - 4
		Random rdn = new Random();
		int rand = 0;
		while (true)
		{
			rand = rdn.nextInt(5);
			if ( rand != 0) break;
		}
		// Gerar Numero Aleatorio 1 - 4
		
		switch(rand)
		{
			case 1:
				return Labirinto.getLabirinto1();
			case 2:
				return Labirinto.getLabirinto2();
			case 3:
				return Labirinto.getLabirinto3();
			case 4:
				return Labirinto.getLabirinto4();
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static void mostrarLabirinto(ArrayList<ArrayList<Integer>>labirinto, Stack<Integer> x, Stack<Integer> y)
	{
		// Deep Copy labirinto -> labirintoClone
		ArrayList<ArrayList<Integer>> labirintoClone = new ArrayList<ArrayList<Integer>>();
		for( ArrayList<Integer> coluna : labirinto )
		{
			labirintoClone.add( (ArrayList<Integer>) coluna.clone() );
		}
		// Deep Copy labirinto -> labirintoClone			
		
		System.out.println("---------------------------");
		
		// Y -> Coluna
		for(int col = 0; col<labirintoClone.size(); col++)
		{
			
			// X -> Linha
			for (int linha = 0; linha<labirintoClone.get(col).size(); linha++)
			{
				
				// Se na Coluna Y e na linha X nao tiver um 6 setar 7.
				if ( labirinto.get(col).get(linha) != 6)
				{
					labirintoClone.get(col).set(linha, 7);
				}
				
			}
			
			// Setar Personagem -> 9
			labirintoClone.get( y.peek() ).set( x.peek(), 9 );
			
			System.out.println(labirintoClone.get(col));
		}
		
		System.out.println("---------------------------");
		
		
	}
	
	// Getters and Setters
	public static ArrayList<ArrayList<Integer>> getLabirinto1() {
		
		if ( Labirinto.labirinto1.isEmpty() )
		{
			ArrayList<Integer> coluna1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna2 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna3 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna4 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna5 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna6 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna7 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna8 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna9 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna10 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna11 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna12 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna13 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna14 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna15 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna16 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna17 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna18 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna19 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna20 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			
			labirinto1.add(coluna1);
			labirinto1.add(coluna2);
			labirinto1.add(coluna3);
			labirinto1.add(coluna4);
			labirinto1.add(coluna5);
			labirinto1.add(coluna6);
			labirinto1.add(coluna7);
			labirinto1.add(coluna8);
			labirinto1.add(coluna9);
			labirinto1.add(coluna10);
			labirinto1.add(coluna11);
			labirinto1.add(coluna12);
			labirinto1.add(coluna13);
			labirinto1.add(coluna14);
			labirinto1.add(coluna15);
			labirinto1.add(coluna16);
			labirinto1.add(coluna17);
			labirinto1.add(coluna18);
			labirinto1.add(coluna19);
			labirinto1.add(coluna20);
		
		}
			
		return labirinto1;
	}
	
	public static ArrayList<ArrayList<Integer>> getLabirinto2() {
		
		if ( Labirinto.labirinto2.isEmpty() )
		{
			ArrayList<Integer> coluna1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna2 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna3 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna4 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna5 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna6 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna7 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna8 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna9 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna10 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna11 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna12 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna13 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna14 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna15 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna16 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna17 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna18 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna19 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna20 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			
			labirinto2.add(coluna1);
			labirinto2.add(coluna2);
			labirinto2.add(coluna3);
			labirinto2.add(coluna4);
			labirinto2.add(coluna5);
			labirinto2.add(coluna6);
			labirinto2.add(coluna7);
			labirinto2.add(coluna8);
			labirinto2.add(coluna9);
			labirinto2.add(coluna10);
			labirinto2.add(coluna11);
			labirinto2.add(coluna12);
			labirinto2.add(coluna13);
			labirinto2.add(coluna14);
			labirinto2.add(coluna15);
			labirinto2.add(coluna16);
			labirinto2.add(coluna17);
			labirinto2.add(coluna18);
			labirinto2.add(coluna19);
			labirinto2.add(coluna20);
		
		}
			
		return labirinto2;
	}
	public static ArrayList<ArrayList<Integer>> getLabirinto3() {

		if ( Labirinto.labirinto3.isEmpty() )
		{
			ArrayList<Integer> coluna1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna2 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna3 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna4 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna5 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna6 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna7 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna8 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna9 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna10 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna11 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna12 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna13 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna14 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna15 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna16 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna17 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna18 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna19 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna20 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			
			labirinto3.add(coluna1);
			labirinto3.add(coluna2);
			labirinto3.add(coluna3);
			labirinto3.add(coluna4);
			labirinto3.add(coluna5);
			labirinto3.add(coluna6);
			labirinto3.add(coluna7);
			labirinto3.add(coluna8);
			labirinto3.add(coluna9);
			labirinto3.add(coluna10);
			labirinto3.add(coluna11);
			labirinto3.add(coluna12);
			labirinto3.add(coluna13);
			labirinto3.add(coluna14);
			labirinto3.add(coluna15);
			labirinto3.add(coluna16);
			labirinto3.add(coluna17);
			labirinto3.add(coluna18);
			labirinto3.add(coluna19);
			labirinto3.add(coluna20);
		
		}
		
		return labirinto3;
	}
	public static ArrayList<ArrayList<Integer>> getLabirinto4() {

		if ( Labirinto.labirinto4.isEmpty() )
		{
			ArrayList<Integer> coluna1 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna2 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna3 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna4 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna5 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna6 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna7 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna8 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna9 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna10 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna11 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna12 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna13 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna14 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna15 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna16 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			ArrayList<Integer> coluna17 = new ArrayList<Integer>(Arrays.asList(1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0));
			ArrayList<Integer> coluna18 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0));
			ArrayList<Integer> coluna19 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0));
			ArrayList<Integer> coluna20 = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1));
			
			labirinto4.add(coluna1);
			labirinto4.add(coluna2);
			labirinto4.add(coluna3);
			labirinto4.add(coluna4);
			labirinto4.add(coluna5);
			labirinto4.add(coluna6);
			labirinto4.add(coluna7);
			labirinto4.add(coluna8);
			labirinto4.add(coluna9);
			labirinto4.add(coluna10);
			labirinto4.add(coluna11);
			labirinto4.add(coluna12);
			labirinto4.add(coluna13);
			labirinto4.add(coluna14);
			labirinto4.add(coluna15);
			labirinto4.add(coluna16);
			labirinto4.add(coluna17);
			labirinto4.add(coluna18);
			labirinto4.add(coluna19);
			labirinto4.add(coluna20);
		
		}
		
		return labirinto4;
	}
	
}
