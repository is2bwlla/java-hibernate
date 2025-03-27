package br.ETS.almoxarifado;
// O DTO (Data Transfer Object) não é uma classe, é um Record
// O DTO é imutável, ele recebe, salva e devolve

public record MaterialDTO(String nome, String fornecedor, int quantidade) {

}
