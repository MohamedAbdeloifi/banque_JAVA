package fr.banque.application;

import java.sql.SQLException;

import fr.banque.dao.TitulaireDao;
import fr.banque.dao.TitulaireDaoImplement;

public class Application {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		TitulaireDao inscription = new TitulaireDaoImplement();
		inscription.lire();
	}

}
