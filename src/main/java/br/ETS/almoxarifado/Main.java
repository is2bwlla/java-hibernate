package br.ETS.almoxarifado;

import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Material caneta = new Material(new MaterialDTO("Caneta", "Só canetas", 600));

        // Gerencia as entidades do banco de dados, o EntityManagerFactory é um classe
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("almoxarifado");
    }
}