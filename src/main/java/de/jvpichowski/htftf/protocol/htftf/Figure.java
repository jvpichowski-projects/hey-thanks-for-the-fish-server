package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("figure")
public record Figure(
		@XStreamAsAttribute String penguin //TODO int? player? person?
) { }
