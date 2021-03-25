package de.jvpichowski.htftf.protocol.base;

import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class TestJoinRoomRequest {

	@Test
	public void testSerialize() throws IOException {
		XStream xstream = new XStream();
		xstream.processAnnotations(JoinRoomRequest.class);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		var stream = xstream.createObjectOutputStream(outputStream, "protocol");
		stream.writeObject(new JoinRoomRequest("swc_2015_hey_danke_fuer_den_fisch"));
		stream.close();

		String expected =
"""
<protocol>
  <join gameType="swc_2015_hey_danke_fuer_den_fisch"/>
</protocol>""";

		String actual = outputStream.toString();

		Assert.assertEquals(expected, actual);
	}

}
