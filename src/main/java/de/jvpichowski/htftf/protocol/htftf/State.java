package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import de.jvpichowski.htftf.protocol.base.ProtocolMessage;

@XStreamAlias("state")
public record State(
	PlayerData blue,
	PlayerData red,
	Board board,
	Move lastMove
) implements ProtocolMessage { }
