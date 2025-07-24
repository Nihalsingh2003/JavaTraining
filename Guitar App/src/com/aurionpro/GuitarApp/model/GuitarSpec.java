package com.aurionpro.GuitarApp.model;

public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {

		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	@Override
	public String toString() {
		return "builder=" + builder + ", model=" + model + ", type=" + type + ", backWood=" + backWood + ", topWood="
				+ topWood;
	}

	public boolean matches(GuitarSpec specs) {
		if (specs == null)
			return false;

		if (specs.getModel() != null && specs.getModel().equalsIgnoreCase(this.getModel())) {
			return true;
		}
		if (specs.getBuilder() != null && specs.getBuilder() == this.getBuilder()) {
			return true;
		}
		if (specs.getType() != null && specs.getType() == this.getType()) {
			return true;
		}
		if (specs.getBackWood() != null && specs.getBackWood() == this.getBackWood()) {
			return true;
		}
		if (specs.getTopWood() != null && specs.getTopWood() == this.getTopWood()) {
			return true;
		}

		
		return false;
	}
}
