package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
// import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.commands.CharacterizeDrivetrainCommand;
// import frc.robot.commands.ZeroClimberCommand;
// import frc.robot.commands.ZeroHoodCommand;
import frc.robot.util.DriverReadout;

public class Robot extends TimedRobot {
    private final RobotContainer m_robotContainer = new RobotContainer();
    private Command m_autonomousCommand;

    @SuppressWarnings("unused")
    private final CharacterizeDrivetrainCommand characterizeCommand = new CharacterizeDrivetrainCommand(
            m_robotContainer.getDrivetrain());

    @SuppressWarnings("unused")
    private final DriverReadout driverReadout = new DriverReadout(m_robotContainer);

    @Override
    public void robotInit() {

    }

    @Override
    public void robotPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        // robotContainer.getShooter().setHoodBrakeMode(false);
    }

    @Override
    public void disabledExit() {
        // robotContainer.getShooter().setHoodBrakeMode(false);
    }

    @Override
    public void teleopInit() {
        // if (!robotContainer.getClimber().isClimberZeroed()) {
        // new ZeroClimberCommand(robotContainer.getClimber()).schedule();
        // }
        // if (!robotContainer.getShooter().isHoodZeroed()) {
        // new ZeroHoodCommand(robotContainer.getShooter(), true).schedule();
        // }
        if (m_autonomousCommand != null) {
            m_autonomousCommand.cancel();
        }

    }

    @Override
    public void testInit() {
        // new InstantCommand(robotContainer.getShooter()::disableFlywheel);
        CommandScheduler.getInstance().cancelAll();
    }

    @Override
    public void autonomousInit() {
        m_autonomousCommand = m_robotContainer.getAutonomousChooser().getCommand(m_robotContainer);
        // schedule the autonomous command (example)
        if (m_autonomousCommand != null) {
            m_autonomousCommand.schedule();
        }
    }
}
