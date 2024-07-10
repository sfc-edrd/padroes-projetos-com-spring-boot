package lab.learning.gof.pure_java.strategy;

public class RegularBehavior implements IBehavior
{
    @Override
    public void move()
    {
        System.out.println("Moving regularly");
    }
}
