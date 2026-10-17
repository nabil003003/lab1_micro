package com.example.dao;

public class DaoImpl implements IDao {

    @Override
    public double lireValeur() {
        // Simule une requête vers une base de données ou un service distant
        System.out.println("[DAO] Récupération de la valeur depuis la source de données...");
        return 120.0;
    }
}
