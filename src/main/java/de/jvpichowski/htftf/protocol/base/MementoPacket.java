package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("memento")
public record MementoPacket(
	GameState state
) implements ProtocolMessage { }
