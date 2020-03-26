package model;


//PROGRESSION - 2 
//Go to JAVA Resouces - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 

public class Bulbasaur extends Pokemon
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
	public Bulbasaur(String pokemonName, int pokemonNumber,String type,String evolution,String baseExp,String characteristics) {
		super(pokemonName, pokemonNumber);
		// TODO Auto-generated constructor stub
		this.pokemonName = "Bulbasaur";
		this.pokemonNumber = 001;
		this.type = "POISON";
		this.evolution = "IVYSAUR";
		this.baseExp = "64";
		this.characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
	}
}

