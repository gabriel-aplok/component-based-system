package com.devash.componentbasedsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class GameObject {
    private List<Component> components;

    public GameObject() {
        components = new ArrayList<>();

		start();
    }

    public void addComponent(Component component) {
        components.add(component);
        component.setGameObject(this);
    }

    public void removeComponent(Component component) {
        components.remove(component);
        component.setGameObject(null);
    }

	public <T extends Component> T getComponent(Class<T> componentType) {
		for (Component component : components) {
			if (componentType.isInstance(component)) {
				return componentType.cast(component);
			}
		}
		return null;
	}

	public void setAllComponents(List<Component> components) {
		this.components = components;
	}

	public List<Component> getAllComponents() {
		return components;
	}

	public void start() {}

    public void update() {
        for (Component component : components) {
            component.update();
        }
    }
}
