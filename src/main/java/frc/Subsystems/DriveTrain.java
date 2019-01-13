package frc.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;                                          
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {

    //Motors
    WPI_TalonSRX frontLeftMotor, middleLeftMotor, backLeftMotor, frontRightMotor, middleRightMotor, backRightMotor;

    //Controller Groups
    SpeedControllerGroup leftMotors, rightMotors;

    DifferentialDrive differentialDrive;

    public DriveTrain(int frontLeftMotorPort, int frontRightMotorPort, int middleRightMotorPort, int backLeftMotorPort, 
    int middleLeftMotorPort, int backRightMotorPort) {

      //Initialize motors

      frontLeftMotor = new WPI_TalonSRX(frontLeftMotorPort);
      frontRightMotor = new WPI_TalonSRX(frontRightMotorPort);
      middleLeftMotor = new WPI_TalonSRX(middleLeftMotorPort);
      middleRightMotor = new WPI_TalonSRX(middleRightMotorPort);
      backLeftMotor = new WPI_TalonSRX(backLeftMotorPort);
      backRightMotor = new WPI_TalonSRX(backRightMotorPort);

      //Initialize controller groups

      leftMotors = new SpeedControllerGroup(frontLeftMotor, middleLeftMotor, backLeftMotor);
      rightMotors = new SpeedControllerGroup(frontRightMotor, middleRightMotor, backRightMotor);
    
      differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
    } 

    public void singleDrive(Joystick j) {
          //Set motor speeds to joystick values
          arcadeDrive(j.getY(), j.getThrottle());
    }

    public void setDriveSpeed(double speed) {
      
    }
    //default arcade drive
public void arcadeDrive(double forwardSpeed, double rightSpeed) {

    differentialDrive.arcadeDrive(forwardSpeed, rightSpeed);
}
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}