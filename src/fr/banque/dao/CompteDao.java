package fr.banque.dao;

import java.sql.SQLException;

import fr.banque.model.Compte;

public interface CompteDao {
	public void ajouter(Compte compte) throws SQLException;
	public void lire() throws SQLException;
	public void modifier(Compte compte) throws SQLException;
	public void supprimer(Compte compte) throws SQLException;
}
