package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.math.BigDecimal;
import java.util.List;

@XStreamAlias("score")
public record PlayerScore(
		@XStreamAsAttribute ScoreCausa cause,
		@XStreamAsAttribute String reason,
		@XStreamImplicit(itemFieldName = "part") List<BigDecimal> parts
) { }
