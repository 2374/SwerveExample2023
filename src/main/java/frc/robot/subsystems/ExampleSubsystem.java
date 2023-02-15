package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase {

    private static ExampleSubsystem instance;

    public ExampleSubsystem() {
        instance = this;
    }

    public ExampleSubsystem getinstance() {
        if (instance == null) {
            instance = new ExampleSubsystem();
        }
        return instance;
    }

}
