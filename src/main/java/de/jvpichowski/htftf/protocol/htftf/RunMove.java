package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("RunMove")
public record RunMove(
	@XStreamAsAttribute int fromX,
	@XStreamAsAttribute int fromY,
	@XStreamAsAttribute int toX,
	@XStreamAsAttribute int toY
) implements Move { }
