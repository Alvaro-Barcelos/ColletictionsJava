package Set;

import com.sun.source.tree.Tree;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {

        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        System.out.println("Cores do arco iris");
        for (String cores : coresArcoIris){
            System.out.println(cores);
        }

        System.out.println("Quantidade de cores no arco iris " + coresArcoIris.size());

        System.out.println("ORDEM ALFABETICA");
        Set<String> coresArcoIrisAlfabetica = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIrisAlfabetica);

        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIrisInversa = new LinkedHashSet<>(Arrays.asList("violeta","anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIrisInversa);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIrisInversa);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        for (String cores : coresArcoIrisList){
            if (cores.startsWith("v")){
                System.out.println(cores);
            }
        }

        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if (!iterator.next().startsWith("v")){
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}
