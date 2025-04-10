package br.ETS.almoxarifado;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        Categoria escritorio = new Categoria("ESCRITÓRIO");
        Material caneta;
        caneta = new Material(new MaterialDTO("Caneta", "Só canetas", 600, escritorio));

        // Gerencia as entidades do banco de dados, o EntityManagerFactory é um classe
        EntityManager entityManager = JPAUtil.getEntityManager();

        CategoriaDAO categoriaDAO = new CategoriaDAO(entityManager);
        MaterialDAO materialDAO = new MaterialDAO(entityManager);

        entityManager.getTransaction().begin();
        categoriaDAO.cadastrar(escritorio);
        materialDAO.cadastrar(caneta);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}