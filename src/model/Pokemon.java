package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon
{
	String pokemonName;
	int pokemonNumber;
	public String getpokemonName()
	{
		return this.pokemonName;
	}
	public void setpokemonName(String pokemonName)
	{
		this.pokemonName = pokemonName;
	}
	public int getpokemonNumber()
	{
		return this.pokemonNumber;
	}
	public void setpokemonNumber(int pokemonNumber)
	{
		this.pokemonNumber = pokemonNumber;
	}
	public Pokemon(String pokemonName,int pokemonNumber)
	{
		this.pokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
	}
}