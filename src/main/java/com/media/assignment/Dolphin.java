package com.media.assignment;

public class Dolphin extends Animal {

	@Override
	protected void initProperties() {
		super.initProperties();
		this.canSing = true;
		this.canSwim = true;
	}

}
