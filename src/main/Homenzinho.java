package main;

import java.util.ArrayList;
import java.util.Stack;

public class Homenzinho {

	public Homenzinho(ArrayList<ArrayList<Integer>> labirinto, int x, int y) {
		this.labirinto = labirinto;
		this.caminhoAndadoX.add(x);
		this.caminhoAndadoY.add(y);
	}
	
	private ArrayList<ArrayList<Integer>> labirinto = new ArrayList<ArrayList<Integer>>();
	private Stack<Integer> caminhoAndadoX = new Stack<Integer>();
	private Stack<Integer> caminhoAndadoY = new Stack<Integer>();
	
	public int tocarParede(char seta) {
		
		seta = Character.toUpperCase(seta);
		
		// W -> ( Y + 1, X )
		if ( seta == 'W' )
		{
			if (this.labirinto.get( this.caminhoAndadoY.peek() + 1 ).get(this.caminhoAndadoX.peek()) == 1)
				return 1;
			else
				return 0;
		}
		
		// A -> ( Y, X + 1 )
		else if ( seta == 'A' )
		{
			
			if ( this.labirinto.get(this.caminhoAndadoY.peek()).get( this.caminhoAndadoX.peek() + 1 ) == 1)
				return 1;
			else
				return 0;
		}
		
		// D -> ( Y, X - 0 )
		else if ( seta == 'D' )
		{
			if ( this.labirinto.get(this.caminhoAndadoY.peek()).get( this.caminhoAndadoX.peek() - 1 ) == 1)
				return 1;
			else
				return 0;
		}
		
		// S -> ( Y - 1, X  )
		else if ( seta == 'S' )
		{
			if ( this.labirinto.get( this.caminhoAndadoY.peek() - 1 ).get(this.caminhoAndadoX.peek()) == 1)
				return 1;
			else
				return 0;
		}
		
		return 1;
	}
	
	public void Andar(char seta) {
		
		seta = Character.toUpperCase(seta);
		
		// W -> ( Y + 1, X )
		if ( seta == 'W' )
		{
			// Pegue para mim na ultima coluna andada e na ultima linha andada e seta o valor 6.
			// Ultimo Caminho percorrido.
			this.labirinto.get(this.caminhoAndadoY.peek()).set(this.caminhoAndadoX.peek(), 6);
			this.caminhoAndadoY.add( this.caminhoAndadoY.peek() + 1 );
			this.caminhoAndadoX.add( this.caminhoAndadoX.peek() );
			
		}
		
		// A -> ( Y, X + 1 )
		else if ( seta == 'A' )
		{
			// Pegue para mim na ultima coluna andada e na ultima linha andada e seta o valor 6.
			// Ultimo Caminho percorrido.
			this.labirinto.get(this.caminhoAndadoY.peek()).set(this.caminhoAndadoX.peek(), 6);
			this.caminhoAndadoX.add( this.caminhoAndadoX.peek() + 1 );
			this.caminhoAndadoY.add( this.caminhoAndadoY.peek() );
		}
		
		// D -> ( Y, X - 0 )
		else if ( seta == 'D' )
		{
			// Pegue para mim na ultima coluna andada e na ultima linha andada e seta o valor 6.
			// Ultimo Caminho percorrido.
			this.labirinto.get(this.caminhoAndadoY.peek()).set(this.caminhoAndadoX.peek(), 6);
			this.caminhoAndadoX.add( this.caminhoAndadoX.peek() - 1 );
			this.caminhoAndadoY.add( this.caminhoAndadoY.peek() );
		}
		
		// S -> ( Y - 1, X  )
		else if ( seta == 'S' )
		{
			// Pegue para mim na ultima coluna andada e na ultima linha andada e seta o valor 6.
			// Ultimo Caminho percorrido.
			this.labirinto.get(this.caminhoAndadoY.peek()).set(this.caminhoAndadoX.peek(), 6);
			this.caminhoAndadoY.add( this.caminhoAndadoY.peek() - 1 );
			this.caminhoAndadoX.add( this.caminhoAndadoX.peek() );
		}
		
	}

	public Stack<Integer> getCaminhoAndadoX() {
		return caminhoAndadoX;
	}

	public Stack<Integer> getCaminhoAndadoY() {
		return caminhoAndadoY;
	}
	
}
