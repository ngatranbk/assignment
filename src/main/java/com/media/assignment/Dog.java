package com.media.assignment;

public class Dog extends Animal {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canWalk = true;
		this.canSay = true;
		this.canSwim = true;

		this.sound = "Woof, woof";
	}

}
