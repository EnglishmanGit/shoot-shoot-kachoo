package frc.team4976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4976.robot.Robot;

public class StopShooter extends Command {

    public StopShooter() { requires(Robot.shooter); }

    @Override protected void initialize() { Robot.shooter.stopShooter(); }

    @Override protected boolean isFinished() { return true; }
}
