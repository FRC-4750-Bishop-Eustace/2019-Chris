package frc.Commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Extend extends InstantCommand {
  public Extend() {
    requires(Robot.hatch);
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    Robot.hatch.pistonExtend();
  }
}
