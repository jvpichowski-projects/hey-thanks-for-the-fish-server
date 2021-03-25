package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import de.jvpichowski.htftf.protocol.base.ProtocolMessage;

@XStreamAlias("welcomeMessage")
public record WelcomeMessage(
		@XStreamAsAttribute String color
) implements ProtocolMessage { }
