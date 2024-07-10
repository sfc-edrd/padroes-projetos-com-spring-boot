package lab.learning.gof.pure_java.singleton;

/**
 * Exemplo de Singleton 'Preguiçoso'
 */
public class LazySingleton
{
    private static LazySingleton instance;

    private LazySingleton()
    {
        super();
    }

    public static LazySingleton getInstance()
    {
        return instance == null
                ? instance = new LazySingleton()
                : instance;
    }

    public static void main(String[] args)
    {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton == lazySingleton2);
    }
}

