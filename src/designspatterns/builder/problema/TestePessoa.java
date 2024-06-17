package designspatterns.builder.problema;

import designspatterns.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Moisés", "Lima", "05033344432", "moiseslima@gmail.com", "Zé Pequeno", LocalDate.of(2006, 10, 9));

        System.out.println(pessoa);
    }
}
