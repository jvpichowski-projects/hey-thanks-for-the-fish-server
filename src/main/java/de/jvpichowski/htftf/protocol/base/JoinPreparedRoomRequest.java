package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("joinPrepared")
public record JoinPreparedRoomRequest(
	@XStreamAsAttribute String reservationCode
) { }
