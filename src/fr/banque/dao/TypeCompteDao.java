package fr.banque.dao;

import java.sql.SQLException;

import fr.banque.model.TypeCompte;

public interface TypeCompteDao {
	public void ajouter(TypeCompte typecompte) throws SQLException;
	public void lire() throws SQLException;
	public void modifier(TypeCompte typecompte) throws SQLException;
	public void supprimer(TypeCompte typecompte) throws SQLException;
}
