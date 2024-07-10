package lab.learning.gof.pure_java.strategy;

public class Robot
{
    private IBehavior robotBehavior;

    public void setRobotBehavior(IBehavior behavior)
    {
        robotBehavior = behavior;
    }

    public void robotMovement()
    {
        robotBehavior.move();
    }

    public static void main(String[] args)
    {
        Robot       robot;
        IBehavior   behavior;

        // ROBOT INSANTIATION
        robot = new Robot();
        // REGULAR BEHAVIOR
        behavior = new RegularBehavior();
        robot.setRobotBehavior(behavior);
        robot.robotMovement();
        robot.robotMovement();

        // DEFENSIVE BEHAVIOR
        behavior = new DefensiveBehavior();
        robot.setRobotBehavior(behavior);
        robot.robotMovement();

        // AGGRESSIVE BEHAVIOR
        behavior = new AggressiveBehavior();
        robot.setRobotBehavior(behavior);
        robot.robotMovement();
        robot.robotMovement();
    }
}


