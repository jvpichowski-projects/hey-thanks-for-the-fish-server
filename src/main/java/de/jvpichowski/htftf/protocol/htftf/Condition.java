package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("condition")
public record Condition(
		@XStreamAsAttribute Team winner,
		@XStreamAsAttribute String reason
) { }
