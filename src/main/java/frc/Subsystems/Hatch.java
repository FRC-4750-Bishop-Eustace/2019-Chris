package frc.Subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.RobotMap;
/**
 * Add your docs here.
 */
public class Hatch extends Subsystem {

  DoubleSolenoid hatchPiston;
public static final Subsystem pistonExtend = null;


  public Hatch() {

    hatchPiston = new DoubleSolenoid(RobotMap.hatchPistonExtend, RobotMap.hatchPistonRetract);
  }

  public void pistonExtend() {
    hatchPiston.set(Value.kForward);
  }
  public void pistonRetract(){
    hatchPiston.set(Value.kReverse);
  }
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
