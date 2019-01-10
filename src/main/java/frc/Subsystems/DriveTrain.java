/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;                                          
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {

    //Motors
    WPI_TalonSRX frontLeftMotor,  backLeftMotor, frontRightMotor, backRightMotor;

    //Controller Groups
    SpeedControllerGroup leftMotors, rightMotors;


    public DriveTrain(int frontLeftMotorPort, int frontRightMotorPort, int backLeftMotorPort,  int backRightMotorPort) {

      //Initialize motors

      frontLeftMotor = new WPI_TalonSRX(frontLeftMotorPort);
      frontRightMotor = new WPI_TalonSRX(frontRightMotorPort);
      backLeftMotor = new WPI_TalonSRX(backLeftMotorPort);
      backRightMotor = new WPI_TalonSRX(backRightMotorPort);

      //Initialize controller groups

      leftMotors = new SpeedControllerGroup(frontLeftMotor, backLeftMotor);
      rightMotors = new SpeedControllerGroup(frontRightMotor, backRightMotor);
    } 


    public void singleDrive(Joystick j) {
          //Set motor speeds to joystick values
          arcadeDrive(j.getY(), j.getThrottle());
    }
    //default arcade drive
public void arcadeDrive(double forwardSpeed, double rightSpeed) {
    arcadeDrive(forwardSpeed, rightSpeed);
}
  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}