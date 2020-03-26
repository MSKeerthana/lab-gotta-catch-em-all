package controller;
import model.*;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";

		if (value1 != null) {
			
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			Bulbasaur bul=new Bulbasaur("Bulbasaur",001,"Bulbasaur is a Grass/poison-type pokémon introduced in Generation I.It evolves into Ivysaur starting at level 16. It is one of the three Starter pokémon in the Kanto region.",
					"POISON","IVYSAUR","64");
			msg = "<center>" + bul.getpokemonName()+ "  #" + bul.getpokemonNumber();
			request.setAttribute("message2",bul.getpokemonNumber());
			request.setAttribute("character1", bul.getchar());
			request.setAttribute("type1",bul.gettype());
			request.setAttribute("evolution1",bul.getevolution());
			request.setAttribute("baseExp1", bul.getbaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			  
			Charizard cha= new Charizard("Charizard",006,"\"Charizard is fit and strong and has the ability to soar up to ridiculous heights. With a single breath of fire, it can burn down forests and melt gigantic glaciers.",
					"FIRE","CHARMELEON","240"); 
			msg = "<center>" + cha.getpokemonName() + "  #" +  cha.getpokemonNumber();
			request.setAttribute("message2", cha.getpokemonNumber());
			request.setAttribute("character2",cha.getchar());
			request.setAttribute("type2",cha.gettype());
			request.setAttribute("evolution2", cha.getevolution());
			request.setAttribute("baseExp2",cha.getbaseExp());
		}

		if (value3 != null) {

			 Dragonite drag=new  Dragonite(" Dragonite",149,"Dragonite is capable of flying faster than the speed of sound.It is a kindhearted pokémon with human-like intelligence. It shows signs of altruism.", "DRAGON","DRATINI","270"); 
			  msg = "<center>" + drag.getpokemonName() + "  #" +  drag.getpokemonNumber();
				request.setAttribute("message3",drag.getpokemonNumber());
				request.setAttribute("character3", drag.getchar());
				request.setAttribute("type3",drag.gettype());
				request.setAttribute("evolution3",drag.getevolution());
				request.setAttribute("baseExp3", drag.getbaseExp());
		}
		if (value4 != null) {

			Mew m=new Mew("Mew",151,"Mew is a psychic-type Mythical pokémon introduced in Generation I. Mew is notable for its unique ability to learn every Technical Machine, Technical Record & Hidden Machine.",
					"pSYCHIC","NONE","64");
			msg = "<center>" + m.getpokemonName() + "  #" +  m.getpokemonNumber();
			request.setAttribute("message4",m.getpokemonNumber());
			request.setAttribute("character4",m.getchar());
			request.setAttribute("type4",m.gettype());
			request.setAttribute("evolution4", m.getevolution());
			request.setAttribute("baseExp4", m.getbaseExp());
		}

		if (value5 != null) {

			Pikachu pika=new Pikachu("pikachu",25,"pikachu is an Electric-type pokémon, which was introduced in Generation I. Over the years, pikachu has become so popular that it serves as the pokémon franchise mascot.",
					"ELECTRIC","RAICHU","112");
			msg = "<center>" + pika.getpokemonName() + "  #" +  pika.getpokemonNumber();
			request.setAttribute("message5",pika.getpokemonNumber());
			request.setAttribute("character5",pika.getchar());
			request.setAttribute("type5",pika.gettype());
			request.setAttribute("evolution5",pika.getevolution());
			request.setAttribute("baseExp5", pika.getbaseExp());
		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
