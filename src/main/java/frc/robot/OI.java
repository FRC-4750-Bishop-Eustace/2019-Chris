package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.commands.SwitchStreamMode;
import frc.commands.ToggleHatch;

/**
 * Handles all of the joystick inputs
 */
public class OI {

    // Joysticks
    public static Joystick driveStick = new Joystick(RobotMap.DRIVESTICK_PORT);

    // Buttons
    Button toggleHatchButton = new JoystickButton(driveStick, 2);
    Button switchStreamMode = new JoystickButton(driveStick, 3);

    public OI() {
        toggleHatchButton.whenReleased(new ToggleHatch());
        switchStreamMode.whenReleased(new SwitchStreamMode());
    }
}