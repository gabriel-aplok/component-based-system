package com.devash.componentbasedsystem;

public class Component {
	protected GameObject gameObject;

	public Component() {
		start();
	}

	public void setGameObject(GameObject gameObject) {
		if (gameObject == null) this.gameObject = gameObject;
	}

	public GameObject getGameObject() {
		return gameObject;
	}

	public void start() {}

	public void update() {}
}
