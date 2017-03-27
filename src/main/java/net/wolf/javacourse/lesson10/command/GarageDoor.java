package net.wolf.javacourse.lesson10.command;

/**
 *
 * @author Andrey
 */
public class GarageDoor {

	public GarageDoor() {
	}

	public void up() {
		System.out.println("Дверь гаража открыта");
	}

	public void down() {
		System.out.println("Дверь гаража закрыта");
	}

	public void stop() {
		System.out.println("Дверь гаража на паузе");
	}

	public void lightOn() {
		System.out.println("Свет в гараже включен");
	}

	public void lightOff() {
		System.out.println("Свет в гараже выключен");
	}
}
