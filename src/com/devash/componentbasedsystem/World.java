package com.devash.componentbasedsystem;

import java.util.ArrayList;
import java.util.List;

public class World {
	private List<GameObject> gameObjects;
	private List<System> systems;

    public World() {
        gameObjects = new ArrayList<>();
        systems = new ArrayList<>();
    }

    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void removeGameObject(GameObject gameObject) {
        gameObjects.remove(gameObject);
    }

	public <T extends GameObject> T getGameObject(Class<T> gameObjectType) {
		for (GameObject gameObject : gameObjects) {
			if (gameObjectType.isInstance(gameObject)) {
				return gameObjectType.cast(gameObject);
			}
		}
		return null;
	}

	public void setAllGameObjects(List<GameObject> gameObjects) {
		this.gameObjects = gameObjects;
	}

	public List<GameObject> getAllGameObjects() {
		return gameObjects;
	}

    public void addSystem(System system) {
        systems.add(system);
    }

    public void removeSystem(System system) {
        systems.remove(system);
    }

	public <T extends System> T getSystem(Class<T> systemType) {
		for (System system : systems) {
			if (systemType.isInstance(system)) {
				return systemType.cast(system);
			}
		}
		return null;
	}

	public void setAllSystems(List<System> systems) {
		this.systems = systems;
	}

	public List<System> getAllSystems() {
		return systems;
	}

	public void start() {}

    public void update() {
        for (GameObject gameObject : gameObjects) {
            gameObject.update();
        }

        for (System system : systems) {
            system.update();
        }
    }
}
