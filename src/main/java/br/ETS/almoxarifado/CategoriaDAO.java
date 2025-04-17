package br.ETS.almoxarifado;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDAO {
    private EntityManager entityManager;

    public CategoriaDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Categoria categoria) {
        entityManager.getTransaction().begin();
        this.entityManager.persist(categoria);
        entityManager.getTransaction().commit();
//        entityManager.close();
    }

    public void atualizar(Categoria categoria) {
        entityManager.getTransaction().begin();
        this.entityManager.merge(categoria);
        entityManager.getTransaction().commit();
//        entityManager.close();
    }

    public void remover(Categoria categoria) {
//        entityManager.getTransaction().begin();
        categoria = entityManager.merge(categoria);
        this.entityManager.remove(categoria);
        entityManager.getTransaction().commit();
//        entityManager.close();
    }

    public Categoria buscaPorID(int id) {
        entityManager.getTransaction().begin();
        return this.entityManager.find(Categoria.class, id);
    }

    public List<Categoria> lerDadosTabela() {
        entityManager.getTransaction().begin();
        String jqpl = "SELECT c FROM Categoria c";
        return entityManager.createQuery(jqpl, Categoria.class).getResultList();
    }
}
