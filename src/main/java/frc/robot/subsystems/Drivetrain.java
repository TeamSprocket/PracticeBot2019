/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void setLeft(double speed) {
    // if(Math.abs(speed) <= 0.5) {
    //   RobotMap.backLeft.set(-1.5*speed);
    // }
    // else {
    //   double a = 1 / Math.abs(speed);
    //   RobotMap.backLeft.set(-a*speed);
    // }
    RobotMap.backLeft.set(speed);
  }
  public void setRight(double speed) {
    // if(Math.abs(speed) <= 0.5) {
    //   RobotMap.frontRight.set(-speed);
    // }
    // else {
    //   double a = Math.abs(speed) / 1.55;
    //   RobotMap.frontRight.set(-a*speed);
    // }
    RobotMap.frontRight.set(0.5*speed);
  }
  public void arcadeDrive(double speed, double turn) {
    setLeft(speed + turn);
    setRight(speed - turn);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
