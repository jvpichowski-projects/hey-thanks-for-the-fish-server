package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("NullMove")
public record NullMove(
		@XStreamImplicit List<DebugHint> hints
) implements Move { }
