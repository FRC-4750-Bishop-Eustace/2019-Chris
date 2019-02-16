package frc.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class ExtendWrist2 extends InstantCommand {

  public ExtendWrist2() {
    requires(Robot.wrist);
}

  @Override
  protected void initialize() {
    Robot.wrist.extendSolenoid2();
  }

}