package frc.team4976.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team4976.robot.Robot;

public class ShooterSpeed2 extends Command {

    public ShooterSpeed2() { requires(Robot.shooter); }

    @Override protected void initialize() { Robot.shooter.setSpeedTwo(); }

    @Override protected boolean isFinished() { return true; }
}