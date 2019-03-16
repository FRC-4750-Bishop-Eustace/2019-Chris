package frc.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * This class manages the hatch mechanism
 * 
 */
public class Hatch extends Subsystem {

	// Create piston
    public Solenoid hatchPistons;
    
    //creating dio sensor
    public DigitalInput sensor; 

	public Hatch() {
        // Initialize piston to ports
        hatchPistons = new Solenoid(RobotMap.HATCH_PISTON_ID);

        sensor = new DigitalInput(RobotMap.HATCH_SENSOR);
    }


     // Toggles the hatch piston
    public void toggle() {
        if(hatchPistons.get()) {
            hatchPistons.set(false);
        }else {
            hatchPistons.set(true);
        }
    }


    public boolean get(){
        return sensor.get();
    }

	@Override
	public void initDefaultCommand() {
		
	}
}