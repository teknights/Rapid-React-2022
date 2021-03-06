// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

// DriveSubsystem Constants
public static final class DriveConstants {

    // Left Motors Constants
    public static final int DRIVETRAIN_LEFT_FRONT_SPARK = 10;
    public static final int DRIVETRAIN_LEFT_BACK_SPARK = 11;

    // Right Motors Constants
    public static final int DRIVETRAIN_RIGHT_FRONT_SPARK = 12;
    public static final int DRIVETRAIN_RIGHT_BACK_SPARK = 13;
}


// Controller Constants (Ports)
public static final class ControllerConstants {

    // Xbox Controller Port
    public static final int DriverControllerPort = 1;

    // Joystick Controller Port
    public static final int CopilotControllerPort = 0;

}


// Arm Constants
public static final class ArmConstants {

    // Shooting Motor (PWM 4)
    public static final int ARM_SHOOT_SPARK = 4;

    // Intake Motor (PWM 5)
    public static final int ARM_PICKUP_SPARK = 5;

    // Angle Motor (PWM 6)
    public static final int ARM_ANGLE_SPARK = 6;



}








}
