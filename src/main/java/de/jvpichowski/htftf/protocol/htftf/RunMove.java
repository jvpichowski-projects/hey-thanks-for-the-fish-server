package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("RunMove")
public record RunMove(
	@XStreamAsAttribute int fromX,
	@XStreamAsAttribute int fromY,
	@XStreamAsAttribute int toX,
	@XStreamAsAttribute int toY,
	@XStreamImplicit List<DebugHint> hints
) implements Move { }
