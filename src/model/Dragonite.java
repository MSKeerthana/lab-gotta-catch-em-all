package model;


//PROGRESSION - 4
//Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Dragonite must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Dragonite
//pokemonNumber = 149
//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism."
//type = "DRAGON"
//evolution = "DRATINI"
//baseExp = "270" 
public class Dragonite extends Pokemon
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
	public Dragonite(String pokemonName, int pokemonNumber,String type,String evolution,String baseExp,String characteristics) {
		super(pokemonName, pokemonNumber);
		// TODO Auto-generated constructor stub
		this.pokemonName = "Dragonite";
		this.pokemonNumber = 149;
		this.type = "DRAGON";
		this.evolution = "DRATINI";
		this.baseExp = "270";
		this.characteristics = "Dragonite is capable of flying faster than the speed of sound.It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism.";
	}
}