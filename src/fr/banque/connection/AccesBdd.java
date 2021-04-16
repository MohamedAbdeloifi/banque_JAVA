package fr.banque.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class AccesBdd {
	
	public static Connection getConnection() {
		
		Connection connexion = null;
		
		try
	    {
	      // chargement de la classe du pilote JDBC
	      Class.forName("com.mysql.jdbc.Driver");// chargement du pilot pour la connection
	      String url = "jdbc:mysql://localhost:3306/banque";
	      // bd-avion est le nom de votre base de données

	      connexion=DriverManager.getConnection(url,"root","");
	      System.out.println ("ça marche ! ");
	      
	     
	    }
	    catch(Exception e)
	    {
	      System.out.println ("Zut, la connexion a échoué");
	      e.printStackTrace ();
	    }
		return connexion;
	}

	
	
	public AccesBdd() {
		// TODO Auto-generated constructor stub
	}

}
