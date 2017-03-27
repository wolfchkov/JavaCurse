package net.wolf.javacourse.lesson10.command;

/**
 *
 * @author Andrey
 */
public class SimpleRemoteControl {

        private Command slot;

        public void setCommand(Command command) {
                slot = command;
        }

        public void buttonWasPressed() {
                slot.execute();
        }
}
