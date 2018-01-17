package frc.team4976.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    public static Encoder sampleEnc = new Encoder(0,1,false, Encoder.EncodingType.k4X);
    private TalonSRX shoot = new TalonSRX(0);
    private TalonSRX shootSlave = new TalonSRX(1);

    @Override
    protected void initDefaultCommand() {
        shootSlave.set(ControlMode.Follower, 0);
        System.out.println("Slave set");

        sampleEnc.setMaxPeriod(0.1);
        sampleEnc.setMinRate(10);
        sampleEnc.setDistancePerPulse(1);
        sampleEnc.setSamplesToAverage(7);
    }

    //boolean isRunning = false;

    public void stopShooter(){
        shoot.set(ControlMode.PercentOutput, 0);
        shootSlave.set(ControlMode.PercentOutput, 0);
    }

    public void setSpeedOne() {

/*        if (isRunning) {

            shoot.set(ControlMode.PercentOutput, .0);
            shootSlave.set(ControlMode.PercentOutput, .0);
            isRunning = false;
        } else {*/

            shoot.set(ControlMode.PercentOutput, 0.085);
            shootSlave.set(ControlMode.PercentOutput, 0.085);
            //isRunning = true;
    }

    public void setSpeedTwo() {

        shoot.set(ControlMode.PercentOutput, 0.5);
        shootSlave.set(ControlMode.PercentOutput, 0.5);
    }

    public void setSpeedThree() {

        shoot.set(ControlMode.PercentOutput, 0.8);
        shootSlave.set(ControlMode.PercentOutput, 0.8);
    }
}
