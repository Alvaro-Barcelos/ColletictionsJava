package Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      Set notas = new HashSet(); //antes do java 5
//      HashSet<Double> notas = new HashSet<>();
//      Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
/*      Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
*/

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //Não mantem a ordem de inserção
        System.out.println(notas.toString());

        // NÃO DA PRA FAZER BUSCA DE ACORDO COM A POSIÇÃO indexOf()

        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        System.out.println("Menor nota: "+ Collections.min(notas));
        System.out.println("Maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media das notas: " + (soma/ notas.size()));
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)iterator1.remove();
        }
        System.out.println(notas);
        Set<Double> notas2 = new LinkedHashSet<>(); //Na ordem de inserção
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        Set<Double> notas3 = new TreeSet<>(notas2); //Ordem natural
        System.out.println(notas3);

        notas.clear();

        System.out.println("Conteudo esta vazio: " + notas.isEmpty());
        System.out.println("Conteudo 2 esta vazio: " + notas2.isEmpty());
        System.out.println("Conteudo 3 esta vazio: " + notas3.isEmpty());


    }
}
