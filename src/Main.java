import com.devash.componentbasedsystem.Component;
import com.devash.componentbasedsystem.GameObject;
import com.devash.componentbasedsystem.World;

public class Main {
	private static World world;

	public static void main(String... args) {
		world = new World();
		world.addSystem(new PrintSystem(world));

		PrintGameObject printGO = new PrintGameObject();
		printGO.addComponent(new PrintComponent("Hello, dev!"));

		world.addGameObject(printGO);
		world.update();
	}

	private static class PrintSystem extends com.devash.componentbasedsystem.System {

		public PrintSystem(World world) {
			super(world);
		}

		@Override
		public void update() {
			for (GameObject go : world.getAllGameObjects()) {
				if (go.getComponent(PrintComponent.class) != null) {
					PrintComponent printC = go.getComponent(PrintComponent.class);

					System.out.println(printC.print);
				}
			}
		}
	}

	private static class PrintComponent extends Component {
		public CharSequence print;

		public PrintComponent(CharSequence print) {
			this.print = print;
		}
	}

	private static class PrintGameObject extends GameObject {}
}
