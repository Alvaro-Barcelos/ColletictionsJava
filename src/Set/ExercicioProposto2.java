package Set;

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        
        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", 1995,"Azure"));
            add(new LinguagemFavorita("Java", 1980,"IntelliJ"));
            add(new LinguagemFavorita("C++", 1975,"Dev-c++"));
        }};
        System.out.println(linguagens);
        
        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> linguagensOrdemAlfabeticaNome = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagensOrdemAlfabeticaNome){
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Natural: Ide\t--------");
        Set<LinguagemFavorita> linguagensOrdemAlfabeticaIDE = new TreeSet<>(new comparatorIde());
        linguagensOrdemAlfabeticaIDE.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagensOrdemAlfabeticaIDE){
            System.out.println(linguagem);
        }

        System.out.println("--------\tOrdem Natural: AnodeCriação/IDE\t--------");
        Set<LinguagemFavorita> linguagensOrdemAlfabeticaCriacaoIde = new TreeSet<>(new ComparatorCriacaoIde());
        linguagensOrdemAlfabeticaCriacaoIde.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagensOrdemAlfabeticaCriacaoIde) System.out.println(linguagem);

        System.out.println("--------\tOrdem Natural: Nome/AnodeCriação/IDE\t--------");
        Set<LinguagemFavorita> linguagensOrdemAlfabeticaNomeCriacaoIde = new TreeSet<>(new ComparatorNomeCriacaoIde());
        linguagensOrdemAlfabeticaNomeCriacaoIde.addAll(linguagens);
        for (LinguagemFavorita linguagem :  linguagensOrdemAlfabeticaNomeCriacaoIde) System.out.println(linguagem);
    }
}


class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private int anoDeCricao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCricao, String ide) {
        this.nome = nome;
        this.anoDeCricao = anoDeCricao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCricao() {
        return anoDeCricao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCricao=" + anoDeCricao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.getNome().compareTo(o.getNome());
    }
}

class comparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
         int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
         if (ide != 0) return ide;

         return  Integer.compare(l1.getAnoDeCricao(), l2.getAnoDeCricao());
    }
}

class ComparatorNomeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;
        int criacao = Integer.compare(l1.getAnoDeCricao(), l2.getAnoDeCricao());
        if (criacao != 0 ) return criacao;
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

