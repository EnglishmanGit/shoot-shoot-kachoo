package frc.team4976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4976.robot.Robot;

public class ShooterSpeed1 extends Command {

    public ShooterSpeed1() { requires(Robot.shooter); }

    @Override protected void initialize() { Robot.shooter.setSpeedOne(); }

    @Override protected boolean isFinished() { return true; }
}
