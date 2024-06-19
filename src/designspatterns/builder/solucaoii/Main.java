package designspatterns.builder.solucaoii;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Agora toda a responsabilidade de instanciar a classe Pessoa é e somente da classe Builder[BuilderPessoa]
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Moisés")
                .dataDeNascimento(LocalDate.of(2006, 10, 9))
                .documento("23656561715")
                .sobrenome("Lima")
                .email("moiseslima@gmail.com")
                .apelido("Pequinete")
                .build();//("").build();

        System.out.println(pessoa);
    }

}
