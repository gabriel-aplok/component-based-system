package com.devash.componentbasedsystem;

public abstract class System {
	protected World world;

	public System(World world) {
		this.world = world;

		start();
	}

	public void start() {}

	public void update() {}
}
