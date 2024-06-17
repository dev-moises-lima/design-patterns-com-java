package designspatterns.builder.solução;

import designspatterns.builder.Pessoa;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class TestePessoComBuilder {

    public static void main(String[] args) {
        // ... new PessoaBuilder().nome("Moisés").sobrenome("Lima") ... => Fluência de Métodos
        Pessoa pessoa = new PessoaBuilder()
                .nome("Moisés")
                .sobrenome("Lima")
                .documento("467586612")
                .apelido("Zé Pequeno")
                .email("moises.lima@gmail.com")
                .dataDeNascimento(LocalDate.of(2006, 10, 9))
                .criaPessoa();

        System.out.println(pessoa);
    }
}
