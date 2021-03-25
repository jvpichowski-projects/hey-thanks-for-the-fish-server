package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public record PlayerData(
	@XStreamAsAttribute String displayName,
	@XStreamAsAttribute String color,
	@XStreamAsAttribute int points,
	@XStreamAsAttribute int fields
) { }
