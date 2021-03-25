package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("scoreFragment")
public record ScoreFragment(
	@XStreamAsAttribute String name,
	ScoreAggregation aggregation,
	boolean relevantForRanking
) { }
