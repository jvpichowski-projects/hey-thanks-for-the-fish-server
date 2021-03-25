package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

@XStreamAlias("scoreDefinition")
public record ScoreDefinition(
	@XStreamImplicit(itemFieldName = "fragment") List<ScoreFragment> fragments
) { }
