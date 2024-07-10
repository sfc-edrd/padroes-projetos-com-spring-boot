package lab.learning.gof.pure_java.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exemplo de Singleton 'Titular Preguiçoso'
 */
public class LazyHolderSingleton
{
    private static class Holder
    {
        public static LazyHolderSingleton instanceHolder;

        static
        {
            instanceHolder = new LazyHolderSingleton();
        }
    }
    private LazyHolderSingleton()
    {
        super();
    }

    public static LazyHolderSingleton getInstance()
    {
        return Holder.instanceHolder;
    }

    public static void main(String[] args)
    {
//        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
//        LazyHolderSingleton lazyHolderSingleton2 = LazyHolderSingleton.getInstance();
//        System.out.println(lazyHolderSingleton == lazyHolderSingleton2);
        List<String> lista = new ArrayList<>();

        lista.add("Nada");
        lista.add("Outro");

        lista.stream().map(l -> l.toLowerCase() + "s").collect(Collectors.toList()).forEach(System.out::println);
    }
}

