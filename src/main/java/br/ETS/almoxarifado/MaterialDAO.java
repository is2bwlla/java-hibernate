package br.ETS.almoxarifado;

import javax.persistence.EntityManager;

public class MaterialDAO {
    private EntityManager entityManager;

    public MaterialDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Material material){
        this.entityManager.persist(material);
    }
}
