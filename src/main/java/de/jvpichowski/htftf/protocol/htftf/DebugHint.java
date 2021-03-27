package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("hint")
public record DebugHint(
	@XStreamAsAttribute String content
) { }
