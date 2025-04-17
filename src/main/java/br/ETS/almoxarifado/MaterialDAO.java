package br.ETS.almoxarifado;

import com.mysql.cj.util.DnsSrv;

import javax.persistence.EntityManager;
import java.util.List;

public class MaterialDAO {
    private EntityManager entityManager;

    public MaterialDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void cadastrar(Material material){
        entityManager.getTransaction().begin();
        this.entityManager.persist(material);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void atualizar(Material material) {
        entityManager.getTransaction().begin();
        this.entityManager.merge(material);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void remover(Material material) {
        entityManager.getTransaction().begin();
        material = entityManager.merge(material);
        this.entityManager.remove(material);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Material buscaPorID(int id) {
        entityManager.getTransaction().begin();
        return this.entityManager.find(Material.class, id);
    }

    public List<Material> lerDadosTabela() {
        entityManager.getTransaction().begin();
        String jqpl = "SELECT m FROM Material m";
        return entityManager.createQuery(jqpl, Material.class).getResultList();
    }
}
