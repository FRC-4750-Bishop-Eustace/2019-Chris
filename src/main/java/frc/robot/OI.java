package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.Commands.Extend;
import frc.Commands.Retract;

public class OI extends RobotMap {

    //Creating the drivesticks
    public static Joystick driveStick = new Joystick(RobotMap.Left_Joystick_Port);
    
   // Buttons for the 
    Button releasePiston = new JoystickButton(driveStick, 2);
    Button retractPiston = new JoystickButton(driveStick, 3);


    public OI(){

        releasePiston.whenPressed(new Extend());
        retractPiston.whenPressed(new Retract());
    }
    


}