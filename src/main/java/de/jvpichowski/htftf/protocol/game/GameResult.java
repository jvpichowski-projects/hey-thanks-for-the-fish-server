package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import de.jvpichowski.htftf.protocol.base.ProtocolMessage;

import java.util.List;

@XStreamAlias("result")
public record GameResult(
		ScoreDefinition definition,
		@XStreamImplicit(itemFieldName = "score") List<PlayerScore> scores,
		@XStreamImplicit(itemFieldName = "winner") List<Player> winners
) implements ProtocolMessage { }
