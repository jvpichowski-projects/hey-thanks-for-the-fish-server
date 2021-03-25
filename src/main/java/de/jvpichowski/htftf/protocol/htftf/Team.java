package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import de.jvpichowski.htftf.protocol.game.Color;

@XStreamAlias("team")
public enum Team implements Color {
	Blue,
	Red
}
