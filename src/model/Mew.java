package model;

//PROGRESSION - 5
//Go to JAVA Resouces - src/model and create a child class called Mew inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Mew must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class.
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Mew
//pokemonNumber = 151
//characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine."
//type = "PSYCHIC"
//evolution = "NONE"
//baseExp = "64" 
public class Mew extends Pokemon
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
	public Mew(String pokemonName, int pokemonNumber,String type,String evolution,String baseExp,String characteristics) {
		super(pokemonName, pokemonNumber);
		// TODO Auto-generated constructor stub
		this.pokemonName = "Mew";
		this.pokemonNumber = 151;
		this.type = "PSYCHIC";
		this.evolution = "NONE";
		this.baseExp = "64";
		this.characteristics = "Mew is a Psychic-type Mythical Pokémon introduced in Generation I. \n" + 
				"Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.";
	}
}