package com.example.extension;

import com.example.dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double lireValeur() {
        // Simule une requête vers une base de données ou un service distant
        System.out.println("[DAO] Récupération de la valeur depuis un capteur ");
        return 50.0;
    }
}
