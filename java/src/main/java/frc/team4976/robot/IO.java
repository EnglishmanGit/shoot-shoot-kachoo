package frc.team4976.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.team4976.robot.commands.ShooterSpeed1;
import frc.team4976.robot.commands.ShooterSpeed2;
import frc.team4976.robot.commands.ShooterSpeed3;
import frc.team4976.robot.commands.StopShooter;

public class IO
{

    Joystick stick = new Joystick(0);

    public IO() {

        new JoystickButton(stick, 1).whenPressed(new ShooterSpeed1());
        new JoystickButton(stick, 2).whenPressed(new ShooterSpeed2());
        new JoystickButton(stick, 3).whenPressed(new ShooterSpeed3());
        new JoystickButton(stick, 4).whenPressed(new StopShooter());
    }
}
