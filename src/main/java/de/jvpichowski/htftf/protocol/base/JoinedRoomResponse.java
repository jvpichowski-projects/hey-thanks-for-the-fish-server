package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("joined")
public record JoinedRoomResponse (
		@XStreamAsAttribute String roomId
){ }
