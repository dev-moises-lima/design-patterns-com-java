package designspatterns.builder.solucaodois;

import designspatterns.builder.PessoaDois;

import java.time.LocalDate;

public class TestePessoaComBuilderDois {

    public static void main(String[] args) {
        PessoaDois pessoa = new PessoaDois.PessoaBuilder()
                .nome("Moisés")
                .dataDeNascimento(LocalDate.of(2006, 10, 9))
                .documento("23656561715")
                .sobrenome("Lima")
                .email("moiseslima@gmail.com")
                .apelido("Pequinete")
                .criaPessoa();//("").criaPessoa();

        System.out.println(pessoa);
    }

}
