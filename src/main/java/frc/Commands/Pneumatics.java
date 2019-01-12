/*package frc.Commands;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;

public class Pneumatics{

//making the compressor
Compressor compressor = new Compressor();

//making the solenoid 
Solenoid piston;

public Pneumatics() {

    piston =  new Solenoid(RobotMap.hatchPistonPort);

}

public void switchPistons() {

    if (piston.get()) {
            piston.set(false);    
    } else {
            piston.set(true);
    }
}


}
*/