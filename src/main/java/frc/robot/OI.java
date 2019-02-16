package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import frc.commands.ExtendWrist;
import frc.commands.ExtendWrist2;
//import frc.commands.RetractWrist;
import frc.commands.RetractWrist2;
import frc.commands.ToggleHatch;

public class OI {

    // Joysticks
    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);

    // Buttons
    Button toggleHatchButton = new JoystickButton(driveStick, 2);
    //Button switchStreamMode = new JoystickButton(driveStick, 3);
    //Button extendWrist = new JoystickButton(driveStick, 4);
    //Button retractWrist = new JoystickButton(driveStick, 6);
    Button extendWrist2 = new JoystickButton(driveStick, 3);
    Button retractWrist2 = new JoystickButton(driveStick, 5);
    
    public OI() {
        toggleHatchButton.whenReleased(new ToggleHatch());
        //switchStreamMode.whenReleased(new SwitchStreamMode());
    //    extendWrist.whenReleased(new ExtendWrist());
    //    retractWrist.whenReleased(new RetractWrist());
        extendWrist2.whenReleased(new ExtendWrist2());
        retractWrist2.whenReleased(new RetractWrist2());
    }
}