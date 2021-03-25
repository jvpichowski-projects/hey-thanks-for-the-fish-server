package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("join")
public record JoinRoomRequest(
		@XStreamAsAttribute String gameType
) { }
