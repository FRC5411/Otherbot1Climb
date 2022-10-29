// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimbSubsystem extends SubsystemBase {
  WPI_TalonSRX rightbisceps; 
  WPI_TalonSRX leftbiscpes;
  WPI_TalonSRX rupperarms;
  WPI_TalonSRX lupperarms;
  DifferentialDrive biscep;
  DifferentialDrive arms;

  public ClimbSubsystem() {
    rightbisceps = new WPI_TalonSRX(0);
    leftbiscpes = new WPI_TalonSRX(1);
    rupperarms = new WPI_TalonSRX(2);
    lupperarms = new WPI_TalonSRX(3);
    rightbisceps.follow(leftbiscpes);
    rupperarms.follow(lupperarms);
    biscep = new DifferentialDrive(rightbisceps, leftbiscpes);
    arms = new DifferentialDrive(rupperarms, lupperarms);
  }
 public void hook(double speed){
   biscep.arcadeDrive(speed, 0);
 } 
 public void arm(double speed){
  arms.arcadeDrive(speed, 0);
 }
 
 @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation

  }
  public void bisceps(double m_speed) {
  }
}
