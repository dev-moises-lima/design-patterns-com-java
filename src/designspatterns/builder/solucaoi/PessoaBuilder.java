package designspatterns.builder.solucaoi;

import java.time.LocalDate;

public class PessoaBuilder {

    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private LocalDate dataDeNascimento;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaBuilder documento(String documento) {
        this.documento = documento;
        return this;
    }

    public PessoaBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public PessoaBuilder dataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, sobrenome, documento, email, apelido, dataDeNascimento);
    }

}
