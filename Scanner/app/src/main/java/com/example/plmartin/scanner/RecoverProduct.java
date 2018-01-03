package com.example.plmartin.scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class RecoverProduct {
    /*public static ArrayList getFood() {

        ArrayList foods = new ArrayList();

        try {
            String myurl= "http://www.exemple.com/";

            URL url = new URL(myurl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream inputStream = connection.getInputStream();

            String result = InputStreamOperations.InputStreamToString(inputStream);

            // On récupère le JSON complet
            JSONObject jsonObject = new JSONObject(result);
            // On récupère le tableau d'objets qui nous concernent
            JSONArray array = new JSONArray(jsonObject.getString("personnes"));
            // Pour tous les objets on récupère les infos
            for (int i = 0; i < array.length(); i++) {
                // On récupère un objet JSON du tableau
                JSONObject obj = new JSONObject(array.getString(i));
                // On fait le lien Personne - Objet JSON
                Personne personne = new Personne();
                personne.setNom(obj.getString("nom"));
                personne.setPrenom(obj.getString("prenom"));
                // On ajoute la personne à la liste
                personnes.add(personne);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // On retourne la liste des personnes
        return personnes;
    }*/

}
