package model;

/*
 * PROGRESSION - 6 
 * Go to JAVA Resouces - src/model and create a child class
 * called Pikachu inside the model package with the following arguments 
 * String characteristics 
 * String type 
 * String evolution 
 * String baseExp
 * 
 * Pikachu must extend the Pokemon class
 * Generate appropriate getters and setters 
 * Generate a six argument constructor with the following arguments
 * (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and
 * pokemonName and pokemonNumber should refer to the parent constructor in the
 * Pokemon class.
 * 
 * pokemonName = Pikachu 
 * pokemonNumber = 25 
 * characteristics = Pikachu is an Electric-type Pokémon, which was introduced in Generation I. Over the years, Pikachu has become so popular that it serves as the Pokémon franchise
 * mascot." 
 * type = "ELECTRIC" 
 * evolution = "RAICHU" 
 * baseExp = "112"
 */
public class Pikachu extends Pokemon
{
	String characteristics;
	String type;
	String evolution;
	String baseExp;
	public String getchar()
	{
		return this.characteristics;
	}
	public void setchar(String characteristics)
	{
		this.characteristics = characteristics;
	}
	public String gettype()
	{
		return this.characteristics;
	}
	public void settype(String type)
	{
		this.type = type;
	}
	public String getevolution()
	{
		return this.characteristics;
	}
	public void setevolution(String evolution)
	{
		this.evolution = evolution;
	}
	public String getbaseExp()
	{
		return this.baseExp;
	}
	public void setbaseExp(String baseExp)
	{
		this.baseExp = baseExp;
	}
	public Pikachu(String pokemonName, int pokemonNumber,String type,String evolution,String baseExp,String characteristics) {
		super(pokemonName, pokemonNumber);
		// TODO Auto-generated constructor stub
		this.pokemonName = "Pikachu";
		this.pokemonNumber = 25;
		this.type = "ELECTRIC";
		this.evolution = "RAICHU";
		this.baseExp = "112";
		this.characteristics = " Pikachu is an Electric-type Pokémon, which was introduced in Generation I. \n" + 
				"Over the years, Pikachu has become so popular that it serves as the Pokémon franchise mascot.";
	}
}