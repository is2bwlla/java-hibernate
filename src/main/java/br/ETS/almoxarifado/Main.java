package br.ETS.almoxarifado;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        MaterialDAO materialDAO = new MaterialDAO(entityManager);
        CategoriaDAO categoriaDAO = new CategoriaDAO(entityManager);

        Categoria escritorio = new Categoria("ELÉTRICA");
        Material material = new Material(new MaterialDTO("Nível", "Só canetas", 5, escritorio));

//        categoriaDAO.cadastrar(escritorio);
//        materialDAO.cadastrar(material);

//        var categoriaAtualizado = categoriaDAO.buscaPorID(2);
//        categoriaAtualizado.setNome("TÉCNICO EM INFORMAÇÃO");
//        categoriaDAO.atualizar(categoriaAtualizado);

//        var categoriaASerRemovida = categoriaDAO.buscaPorID(9);
//        categoriaDAO.remover(categoriaASerRemovida);

        System.out.println(categoriaDAO.buscaPorID(9));
    }
}