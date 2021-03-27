package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.XStream;
import de.jvpichowski.htftf.protocol.base.RoomPacket;
import de.jvpichowski.htftf.protocol.htftf.*;
import de.jvpichowski.htftf.protocol.htftf.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BoardTest {

	private XStream xstream;
	private ByteArrayOutputStream outputStream;
	private ObjectOutputStream stream;

	@Before
	public void prepareXStream() throws IOException {
		xstream = new XStream();
		outputStream = new ByteArrayOutputStream();
		stream = xstream.createObjectOutputStream(outputStream, "protocol");
	}

	@Test
	public void testBoardSerialization() throws IOException {
		xstream.processAnnotations(RoomPacket.class);
		xstream.processAnnotations(Board.class);
		xstream.processAnnotations(State.class);
		xstream.processAnnotations(RunMove.class);
		var board = new RoomPacket("ROOM_ID", new State(
				new Player("PlayerA", "Blue", 3, 4),
				new Player("PlayerB", "Red", 2, 5),
				new Board(Arrays.asList(
					new Field(0, null),
					new Field(1, (new Figure("Penguin Name")))
				)),
				new RunMove(0,3, 5, 7)
		));
		stream.writeObject(board);
		stream.close();
		String actual = outputStream.toString();

		String expected =
"""
<protocol>
  <room roomId="ROOM_ID">
    <data class="state">
      <blue displayName="PlayerA" color="Blue" points="3" fields="4"/>
      <red displayName="PlayerB" color="Red" points="2" fields="5"/>
      <board>
        <field value="0"/>
        <field value="1">
          <figure penguin="Penguin Name"/>
        </field>
      </board>
      <lastMove class="RunMove" fromX="0" fromY="3" toX="5" toY="7"/>
    </data>
  </room>
</protocol>""";

		Assert.assertEquals(expected, actual);
	}
}
