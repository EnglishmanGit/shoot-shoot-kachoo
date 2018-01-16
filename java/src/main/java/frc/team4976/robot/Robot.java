package frc.team4976.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team4976.robot.subsystems.Shooter;

public class Robot extends IterativeRobot {

    public static IO io;
    public static Shooter shooter = new Shooter();

    public Scheduler scheduler = Scheduler.getInstance();

    @Override
    public void robotInit() { io = new IO(); }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() { }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {

        scheduler.run();
    }

    @Override
    public void testPeriodic() { }
}