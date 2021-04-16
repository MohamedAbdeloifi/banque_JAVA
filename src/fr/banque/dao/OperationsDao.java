package fr.banque.dao;

import java.sql.SQLException;

import fr.banque.model.Operations;


public interface OperationsDao {
	public void ajouter(Operations operation) throws SQLException;
	public void lire() throws SQLException;
	public void modifier(Operations operation) throws SQLException;
	public void supprimer(Operations operation) throws SQLException;
}
