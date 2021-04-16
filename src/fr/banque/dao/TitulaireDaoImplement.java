package fr.banque.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.banque.connection.AccesBdd;
import fr.banque.model.Titulaire;

public class TitulaireDaoImplement implements TitulaireDao {

	@Override
	public void ajouter(Titulaire titulaire) throws SQLException {
		// TODO Auto-generated method stub
		String insert = "INSERT INTO titulaire VALUES  (null, 'lala', 35, 2, 2)";
		Statement statement = (Statement) AccesBdd.getConnection();
		statement.executeUpdate(insert);
	}

	@Override
	public void lire() throws SQLException {
		// TODO Auto-generated method stub
		 //------------------------------REQUETES-----------------------------------
	      
	      Statement statement = AccesBdd.getConnection().createStatement();
	      
	      //--------------------------------SELECT-----------------------------------
	      
	      ResultSet select = null;
	      select = statement.executeQuery("SELECT * FROM titulaire");
	      while(select.next()) {
	    	  System.out.println(select.getString("PRENOMTITULAIRE") + " " + select.getString("NOMTITULAIRE"));
	      }
	}


	@Override
	public void modifier(Titulaire titulaire) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Titulaire titulaire) throws SQLException {
		// TODO Auto-generated method stub
		
	}



}
