package br.ETS.almoxarifado;
import javax.persistence.*;
import java.time.LocalDate;

@Entity   //Vai identificar o que é uma entidade, vai ser uma tabela no banco de dados
@Table (name = "tbmateriaisindiretos")   //Cria a tabela pra mim de forma automática
public class Material {
    @Id     //Vai indicar que meu ID é uma chave-primaria
    @GeneratedValue (strategy = GenerationType.IDENTITY)    //É meu auto incremento
    private int id;
    private String nome;
    @Column (name = "Forn")   //Coloca o nome na coluna do mysql
    private String fornecedor;
    private int quantidade;

    private LocalDate dataCadastro = LocalDate.now();

    @ManyToOne
    private Categoria categoria;

    // Meu construtor
    public Material(MaterialDTO materialDTO) {
        this.nome = materialDTO.nome();
        this.fornecedor = materialDTO.fornecedor();
        this.quantidade = materialDTO.quantidade();
        this.categoria = materialDTO.categoria();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
