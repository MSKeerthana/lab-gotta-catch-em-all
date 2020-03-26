package model;


//PROGRESSION - 3
//Go to JAVA Resouces - src/model and create a child class called Charizard inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Charizard must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Charizard
//pokemonNumber = 006
//characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers."
//type = "FIRE"
//evolution = "CHARMELEON"
//baseExp = "240" 
public class Charizard extends Pokemon
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
	public Charizard(String pokemonName, int pokemonNumber,String type,String evolution,String baseExp,String characteristics) {
		super(pokemonName, pokemonNumber);
		// TODO Auto-generated constructor stub
		this.pokemonName = "Charizard";
		this.pokemonNumber = 006;
		this.type = "FIRE";
		this.evolution = "CHARMELEON";
		this.baseExp = "240";
		this.characteristics = "Charizard is fit and strong and has the ability to soar up to ridiculous heights.With a single breath of fire, it can burn down forests and melt gigantic glaciers.";
	}
}