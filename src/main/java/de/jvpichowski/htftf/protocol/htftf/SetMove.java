package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("SetMove")
public record SetMove(
		@XStreamAsAttribute int setX,
		@XStreamAsAttribute int setY,
		@XStreamImplicit List<DebugHint> hints
) implements Move { }
