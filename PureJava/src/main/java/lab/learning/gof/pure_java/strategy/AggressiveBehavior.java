package lab.learning.gof.pure_java.strategy;

public class AggressiveBehavior implements IBehavior
{
    @Override
    public void move()
    {
        System.out.println("Moving aggressively");
    }
}
