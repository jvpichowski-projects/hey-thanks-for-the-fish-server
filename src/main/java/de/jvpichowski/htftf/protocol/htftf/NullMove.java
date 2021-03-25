package de.jvpichowski.htftf.protocol.htftf;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("NullMove")
public record NullMove() implements Move { }
