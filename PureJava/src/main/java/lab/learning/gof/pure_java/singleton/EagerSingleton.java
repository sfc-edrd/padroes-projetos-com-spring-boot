package lab.learning.gof.pure_java.singleton;

/**
 * Exemplo de Singleton 'Ansioso'
 */
public class EagerSingleton
{
    private static EagerSingleton instance;

    static
    {
        instance = new EagerSingleton();
    }

    private EagerSingleton()
    {
        super();
    }

    public static EagerSingleton getInstance()
    {
        return instance;
    }

    public static void main(String[] args)
    {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton == eagerSingleton2);
    }
}

