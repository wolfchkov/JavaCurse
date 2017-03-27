package net.wolf.javacourse.lesson10.command;

/**
 *
 * @author Andrey
 */
public class LightOnCommand implements Command {

        Light light;

        public LightOnCommand(Light light) {
                this.light = light;
        }

        public void execute() {
                light.on();
        }
}
