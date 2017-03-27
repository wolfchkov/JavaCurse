package net.wolf.javacourse.lesson10.command;

/**
 *
 * @author Andrey
 */
public class LightOffCommand implements Command {

        Light light;

        public LightOffCommand(Light light) {
                this.light = light;
        }

        public void execute() {
                light.off();
        }
}
