package frc.robot.commands.automationCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ExampleSubsystem;

public class ExampleCommand extends CommandBase {
    private final ExampleSubsystem m_ExampleSubsystem;

    public ExampleCommand(ExampleSubsystem exampleSubsystem) {
        m_ExampleSubsystem = exampleSubsystem;
        addRequirements(m_ExampleSubsystem);
    }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        super.initialize();
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
    }

    @Override
    public void end(boolean interrupted) {
        // TODO Auto-generated method stub
        super.end(interrupted);
    }
}
