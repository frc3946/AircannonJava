/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3946.robot;

import org.usfirst.frc.team3946.robot.commands.Launch;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick leftJoystick = new Joystick(0);
	public Joystick rightJoystick = new Joystick(1);
	public XboxController xboxController = new XboxController(2);
	
	Button shootButton = new JoystickButton(leftJoystick, 2);
	
	public OI() {
		
		shootButton.whenPressed(new Launch());
		
	}
}
