package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import de.jvpichowski.htftf.protocol.base.GameState;
import de.jvpichowski.htftf.protocol.base.ProtocolMessage;
import de.jvpichowski.htftf.protocol.game.Color;

@XStreamAlias("state")
public record State(
		@XStreamAsAttribute int turn,
		@XStreamAsAttribute Team startPlayer,
		@XStreamAsAttribute Team currentPlayer,
		@XStreamAsAttribute String currentMoveType,

		Player red,
		Player blue,
		Board board,
		Move lastMove,
		Condition condition
) implements GameState { }
