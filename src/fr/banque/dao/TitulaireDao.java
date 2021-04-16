package fr.banque.dao;

import java.sql.SQLException;

import fr.banque.model.Titulaire;

public interface TitulaireDao {
	
	public void ajouter(Titulaire titulaire) throws SQLException;
	public void lire() throws SQLException;
	public void modifier(Titulaire titulaire) throws SQLException;
	public void supprimer(Titulaire titulaire) throws SQLException;
	
}
