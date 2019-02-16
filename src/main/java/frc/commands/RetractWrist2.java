package frc.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class RetractWrist2 extends InstantCommand {

  public RetractWrist2() {
    requires(Robot.wrist);
}

  @Override
  protected void initialize() {
    Robot.wrist.retractSolenoid2();
  }

} 