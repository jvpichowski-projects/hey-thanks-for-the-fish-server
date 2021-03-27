package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import de.jvpichowski.htftf.protocol.base.ProtocolMessage;

@XStreamAlias("welcomeMessage")
public record WelcomeMessage(
		@XStreamAsAttribute Team color
) implements ProtocolMessage { }
