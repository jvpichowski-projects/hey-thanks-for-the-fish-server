package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public record Player(
	@XStreamAsAttribute String displayName,
	@XStreamAsAttribute Team color,
	@XStreamAsAttribute int points,
	@XStreamAsAttribute int fields
) { }
