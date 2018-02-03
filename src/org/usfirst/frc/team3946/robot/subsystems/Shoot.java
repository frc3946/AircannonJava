package org.usfirst.frc.team3946.robot.subsystems;

import org.usfirst.frc.team3946.robot.RobotMap;
import org.usfirst.frc.team3946.robot.commands.Launch;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shoot extends Subsystem {
	
	public Talon shootTalon = new Talon(RobotMap.shootMotor);

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void TakeShot() {
	
		shootTalon.setSpeed(0);
		Timer.delay(0.2);
		shootTalon.setSpeed(1.0);
		
	}
	
	public void DontShoot() {
		shootTalon.set(0);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Launch());
    }
}

