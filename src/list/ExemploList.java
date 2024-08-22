package list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas); //Pode se utilizar o toString
        System.out.println("--------------------------------------------------");
        System.out.println("Posição da nota 5:" + notas.indexOf(5d));

        System.out.println("--------------------------------------------------");
        System.out.println("Adicionar elemento na posição 4");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("--------------------------------------------------");
        System.out.println("Substituir nota 5 pela nota 6");
        notas.set(notas.indexOf(5d),6.0 );
        System.out.println(notas);

        System.out.println("--------------------------------------------------");
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(9.3));

        System.out.println("--------------------------------------------------");
        System.out.println("Exiba todas as notas na ordem que foi informado: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("--------------------------------------------------");
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("--------------------------------------------------");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("--------------------------------------------------");
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("--------------------------------------------------");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){ //Iterator tem algum numero depois?
            Double next = iterator.next(); //Coloco o elemento dentro da variavel next
            soma += next; // Coloco agora em soma pra gerar um acumulador da soma de todas as notas
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("--------------------------------------------------");
        System.out.println("Media das notas: " + (soma/notas.size()));

        System.out.println("--------------------------------------------------");
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("--------------------------------------------------");
        System.out.println("Remova a posição 0: ");
        notas.remove(0);

        System.out.println("--------------------------------------------------");
        System.out.println("Remova as notas menores que 7:");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("--------------------------------------------------");
        System.out.println("Apague toda a lista:");
        notas.clear();
        System.out.println(notas);

        System.out.println("--------------------------------------------------");
        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());

        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println(notas2.getFirst());
        notas2.removeFirst();
        System.out.println(notas2);
    }
}
