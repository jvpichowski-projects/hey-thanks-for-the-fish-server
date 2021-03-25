package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("scoreAggregation")
public enum ScoreAggregation {
	/** All values from all games should be summed up.  */
	SUM,

	/** All values from all games should be averaged.  */
	AVERAGE
}
