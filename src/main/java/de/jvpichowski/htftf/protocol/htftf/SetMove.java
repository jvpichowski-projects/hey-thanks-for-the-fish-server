package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("SetMove")
public record SetMove(
		@XStreamAsAttribute int setX,
		@XStreamAsAttribute int setY
) implements Move { }
