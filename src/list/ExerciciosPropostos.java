package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        List<Integer> temperatura = new ArrayList<>();
        int temperaturaMes;
        int soma = 0;


        for (int i = 1; i <= 6; i++) {
            System.out.println("Qual a temperatura do mês - " + i);
            temperaturaMes = input.nextInt();
            temperatura.add(temperaturaMes);
            soma += temperaturaMes; //soma para calcular a media
            input.nextLine(); //limpeza do cache
        }

        //OUTRA FORMA DE REALIZAR A SOMA
        //Iterator<Integer> iterator = temperatura.iterator();
        //int sum = 0;
        //while (iterator.hasNext()){
        //    Integer next = iterator.next();
        //    sum += next;
        //}

        System.out.println("TEMPERATURAS");
        System.out.println(temperatura);
        System.out.println("MEDIA SEMESTRAL");
        System.out.println((soma / temperatura.size()));

        System.out.println("TEMPERATURAS ACIMA DA MEDIA");
        for (int temperaturas : temperatura) {
            if (temperaturas > (soma / temperatura.size())) {
                int index = temperatura.indexOf(temperaturas);
                switch (index) {
                    case 0:
                        System.out.println(index + 1 + " - JANEIRO: " + temperaturas + " oC");
                        break;
                    case 1:
                        System.out.println(index + 1 + " - Fevereiro: " + temperaturas + " oC");
                        break;
                    case 2:
                        System.out.println(index + 1 + " - Março: " + temperaturas + " oC");
                        break;
                    case 3:
                        System.out.println(index + 1 + " - Abril: " + temperaturas + " oC");
                        break;
                    case 4:
                        System.out.println(index + 1 + " - Maio: " + temperaturas + " oC");
                        break;
                    case 5:
                        System.out.println(index + 1 + " - Junho: " + temperaturas + " oC");
                        break;
                }
            }




        }

    }
}
