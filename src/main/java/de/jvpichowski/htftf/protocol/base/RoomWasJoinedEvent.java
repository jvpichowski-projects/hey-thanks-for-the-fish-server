package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

//TODO remove
@XStreamAlias("joinedGameRoom")
public record RoomWasJoinedEvent(
	@XStreamAsAttribute String roomId,
	@XStreamAsAttribute boolean existing
) { }
