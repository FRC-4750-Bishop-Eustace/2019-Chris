package frc.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

public class SwitchStreamMode extends InstantCommand {
    
    public SwitchStreamMode() {
        requires(Robot.limelight);
    }

    @Override
    protected void initialize() {
        Robot.limelight.switchStreamMode();
    }
}