package com.octest.dao;

import com.octest.beans.Visiteur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class visiteurDaoImpl implements visiteurDao{
    private DaoFactory daoFactory;
    visiteurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory=daoFactory;
    }


    @Override
    public void ajouter(Visiteur visiteur) {
        Connection connexion = null;
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connexion.prepareStatement("INSERT INTO visiteur(nom, prenom, age) VALUES (?,?,?)");
            preparedStatement.setString(1, visiteur.getNom());
            preparedStatement.setString(2, visiteur.getPrenom());
            preparedStatement.setInt(3, visiteur.getAge());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Visiteur> lester() {
        List<Visiteur> visiteurs = new ArrayList<Visiteur>();
        Connection connexion= null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
            resultat = statement.executeQuery("SELECT  nom, prenom, age FROM Visiteur;");

            while (resultat.next()) {

                String nom = resultat.getString("nom");
                String prenom = resultat.getString("prenom");
                int age = resultat.getInt("age");

                Visiteur visiteur = new Visiteur();

                visiteur.setNom(nom);
                visiteur.setPrenom(prenom);
                visiteur.setAge(age);
                visiteurs.add(visiteur);
            }
        }catch (SQLException e){}
        finally {
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            }catch (SQLException ignore){}

        }
        return visiteurs;
    }
}
