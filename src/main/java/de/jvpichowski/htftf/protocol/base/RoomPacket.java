package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("room")
public record RoomPacket(
		@XStreamAsAttribute String roomId,
		ProtocolMessage data
) { }
