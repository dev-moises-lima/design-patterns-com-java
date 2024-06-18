package designspatterns.builder;

import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;

public class Main {

    public static void main(String[] args) {

        // Exemplo de uso de Builders com StringBuilder
        Locale br = new Locale("pt", "BR");

        StringBuilder sb = new StringBuilder().append("Hoje é ").append(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, br));

        System.out.println(sb);

    }

}
