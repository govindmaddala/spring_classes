package _7_beans_by_spring_component;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	public GameRunner(GamingConsole game) {
		 this.game = game;
	}
	public void run() {
		System.out.println("Running game: " + game);
		game.down();
		game.left();
		game.right();
		game.up();
	}
}
