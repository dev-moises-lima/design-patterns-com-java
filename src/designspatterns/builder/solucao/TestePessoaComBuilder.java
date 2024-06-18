package designspatterns.builder.solucao;

import designspatterns.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args) {

        // ... new PessoaBuilder().nome("Moisés").sobrenome("Lima") ... => Fluência de Métodos
        // Agora podemos usar a classe Builder[PessoaBuilder] para instanciar os objetos da classe Pessoa
        Pessoa pessoa = new PessoaBuilder()
                .nome("Moisés")
                .sobrenome("Lima")
                .documento("467586612")
                .apelido("Zé Pequeno")
                .email("moises.lima@gmail.com")
                .dataDeNascimento(LocalDate.of(2006, 10, 9))
                .build();

        System.out.println(pessoa);
    }
}
