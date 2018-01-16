package frc.team4976.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    private TalonSRX shooter0 = new TalonSRX(0);
    private TalonSRX shooter1 = new TalonSRX(1);

    @Override
    protected void initDefaultCommand() { }

    //boolean isRunning = false;

    public void stopShooter(){
        shooter0.set(ControlMode.PercentOutput, 0);
        shooter1.set(ControlMode.PercentOutput, 0);
    }

    public void setSpeedOne() {

/*        if (isRunning) {

            shooter0.set(ControlMode.PercentOutput, .0);
            shooter1.set(ControlMode.PercentOutput, .0);
            isRunning = false;
        } else {*/

            shooter0.set(ControlMode.PercentOutput, 0.2);
            shooter1.set(ControlMode.PercentOutput, 0.2);
            //isRunning = true;
    }

    public void setSpeedTwo() {

        shooter0.set(ControlMode.PercentOutput, 0.5);
        shooter1.set(ControlMode.PercentOutput, 0.5);
    }

    public void setSpeedThree() {

        shooter0.set(ControlMode.PercentOutput, 0.8);
        shooter1.set(ControlMode.PercentOutput, 0.8);
    }
}
