package com.octest.dao;

import com.octest.beans.Visiteur;

import java.util.List;

public interface visiteurDao {
    void ajouter(Visiteur visiteur);
     List<Visiteur> lester();
}
