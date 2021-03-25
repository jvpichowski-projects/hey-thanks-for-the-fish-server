package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public record Player(
		@XStreamAsAttribute String displayName,
		Color color
) { }
