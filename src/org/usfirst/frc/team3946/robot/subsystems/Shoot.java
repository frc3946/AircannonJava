package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shoot extends Subsystem {
	
	public Talon shootTalon = new Talon(RobotMap.shootMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void TakeShot(){
		shootTalon.set(0.07);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

