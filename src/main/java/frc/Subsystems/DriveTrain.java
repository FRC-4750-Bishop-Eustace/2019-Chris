package frc.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.commands.TankDrive;

/**
 * This class manages the drive train
 */
public class DriveTrain extends Subsystem {

    // Create motors
    WPI_TalonSRX leftMotorOne, leftMotorTwo, rightMotorOne, rightMotorTwo;
    // Create motor groups
    SpeedControllerGroup leftMotors, rightMotors;
    // Create drive
    DifferentialDrive robotDrive;

    // The total degrees off we can call "on target"
    double tolerance = 0.5;
    double kP = 0.06;

    public DriveTrain(int leftMotorOneId, int leftMotorTwoId, int rightMotorOneId, int rightMotorTwoId) {
        leftMotorOne = new WPI_TalonSRX(leftMotorOneId);
        leftMotorTwo = new WPI_TalonSRX(leftMotorTwoId);
        rightMotorOne = new WPI_TalonSRX(rightMotorOneId);
        rightMotorTwo = new WPI_TalonSRX(rightMotorTwoId);

        leftMotorTwo.follow(leftMotorOne);
        rightMotorTwo.follow(rightMotorOne);

        robotDrive = new DifferentialDrive(leftMotorOne, rightMotorOne);
        // Stop "output not updated often enough" error from printing
        robotDrive.setSafetyEnabled(false);
    }

    /**
     * Passes speed and rotate values to the drive train
     * 
     * @param speed + is forward, - is backward
     * @param rotate + is right, - is left
     */
    public void joystickDrive(double speed, double rotate) {
        robotDrive.arcadeDrive(cube(speed), cube(rotate));
    }

    /**
     * Turns the drive train
     * 
     * @param speed + is right, - is left
     */
    public void turn(double speed) {
        robotDrive.arcadeDrive(0, -speed);
    }

    /**
     * Brakes all motors on the drive train
     */
    public void brake() {
        leftMotorOne.stopMotor();
        rightMotorOne.stopMotor();
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
    }

    protected double cube(double value) {
        return 0.2 * Math.pow(value, 3) + (1 - 0.2) * value;
    }

} 