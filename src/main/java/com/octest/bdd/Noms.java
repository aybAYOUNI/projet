package com.octest.bdd;

import com.octest.beans.Visiteur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Noms {
    private Connection connexion;
    public List<Visiteur> recupereVisiteur() throws ClassNotFoundException {
        List<Visiteur> visiteurs = new ArrayList<Visiteur>();
        loadDatabase();
        Statement statement = null;
        ResultSet resultat = null;
        

        
        try {
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

    public void ajouterVisiteur(Visiteur visiteur) throws SQLException {
        loadDatabase();
        PreparedStatement preparedStatement =connexion.prepareStatement("INSERT INTO Visiteur (nom, prenom, age) VALUES(?,?,?)");
        preparedStatement.setString(1,visiteur.getNom());
        preparedStatement.setString(2,visiteur.getPrenom());
        preparedStatement.setInt(3,visiteur.getAge());

        preparedStatement.executeUpdate();
    }
    private void loadDatabase(){

        try {
            Class.forName("com.mysql.jdbc.driver");
        }catch (ClassNotFoundException e){}

        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjavaee","root","");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

