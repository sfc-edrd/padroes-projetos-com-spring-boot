package lab.learning.gof.pure_java.strategy;

public class DefensiveBehavior implements IBehavior
{
    @Override
    public void move()
    {
        System.out.println("Moving defensively");
    }
}
