package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.subsystems.DriveTrain;
import frc.subsystems.Hatch;
import frc.subsystems.Limelight;

public class Robot extends TimedRobot {

  // Initialize sensors
  public static Limelight limelight = new Limelight();

  // Initialize mechanisms
  public static DriveTrain driveTrain = new DriveTrain(RobotMap.LEFT_MOTOR_ONE_ID, RobotMap.LEFT_MOTOR_TWO_ID, RobotMap.RIGHT_MOTOR_ONE_ID, RobotMap.RIGHT_MOTOR_TWO_ID);
  public static Hatch hatch = new Hatch();
  DigitalInput lim = new DigitalInput(0);

  // Initialize OI
  public static OI oi = new OI();

  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic() {
    Scheduler.getInstance().run();
    System.out.println(!lim.get());
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }
}