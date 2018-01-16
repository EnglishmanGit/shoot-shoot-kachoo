package frc.team4976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4976.robot.Robot;

public class ShooterSpeed3 extends Command {

    public ShooterSpeed3() { requires(Robot.shooter); }

    @Override protected void initialize() { Robot.shooter.setSpeedThree(); }

    @Override protected boolean isFinished() { return true; }
}