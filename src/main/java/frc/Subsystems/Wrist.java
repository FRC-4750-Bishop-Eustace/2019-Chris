package frc.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Wrist extends Subsystem {

    //creating the double solenoids
    DoubleSolenoid solenoid;
    DoubleSolenoid solenoid2;


    public Wrist() {
        //defining solenoid ports (forwardChannel, reverseChannel) (should be but check with electrical)
        //solenoid = new DoubleSolenoid(1, 0);
        solenoid2 = new DoubleSolenoid(4, 5);
    }

    //this extends the second solenoid
    public void extendSolenoid2(){
        solenoid2.set(Value.kForward);
    }
    //this extends the first solenoid
   //public void extendSolenoid() {
     //   solenoid.set(Value.kForward);
       //}
    //this retracts the second solenoid
    public void retractSolenoid2(){
        solenoid2.set(Value.kReverse);
    } 
    //this retracts the first solenoid
    //public void retractSolenoid() {
      //  solenoid.set(Value.kReverse);
    //}
    
    @Override
    protected void initDefaultCommand() {


    }

}