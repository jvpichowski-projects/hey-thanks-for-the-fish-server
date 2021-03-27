package de.jvpichowski.htftf.protocol;

import com.thoughtworks.xstream.XStream;
import de.jvpichowski.htftf.protocol.base.*;
import de.jvpichowski.htftf.protocol.game.WelcomeMessage;
import de.jvpichowski.htftf.protocol.htftf.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Protocol {

	public static void main(String[] args) throws IOException {
		//class = "" wird immer mit interface gemacht

		XStream xstream = new XStream();
		xstream.processAnnotations(JoinRoomRequest.class);
		xstream.processAnnotations(JoinPreparedRoomRequest.class);
		xstream.processAnnotations(JoinedRoomResponse.class);
		xstream.processAnnotations(RoomPacket.class);
		xstream.processAnnotations(WelcomeMessage.class);
		xstream.processAnnotations(MementoPacket.class);
		xstream.processAnnotations(State.class);
		xstream.processAnnotations(Board.class);
		xstream.processAnnotations(Player.class);
		xstream.processAnnotations(FieldArray.class);
		xstream.processAnnotations(SetMove.class);
		xstream.processAnnotations(Fields.class); //unnecessary
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		var stream = xstream.createObjectOutputStream(outputStream, "protocol");
		stream.writeObject(new JoinRoomRequest("swc_2015_hey_danke_fuer_den_fisch"));
		stream.writeObject(new JoinPreparedRoomRequest("RC"));
		stream.writeObject(new JoinedRoomResponse("RID"));
		stream.writeObject(new RoomPacket("RID", new WelcomeMessage("RED")));
		stream.writeObject(new RoomPacket("RID", new MementoPacket(new State(
				0,
				Team.RED,
				Team.BLUE,
				"SetMove",
				new Player("Player 1", Team.RED, 2, 3),
				new Player("Player 2", Team.BLUE, 2, 3),
				new Board(new Fields(Arrays.asList(
						new FieldArray(Arrays.asList(
								new Field(3, null),
								new Field(2, new Penguin(Team.BLUE))
						)),
						new FieldArray(Arrays.asList(
								new Field(1, null)
						))
				))),
				new SetMove(5, 3, Arrays.asList(
						new DebugHint("Hint"),
						new DebugHint("Hint 2")
				)),
				new Condition(Team.BLUE, "SOFT_TIMEOUT")
		))));
		stream.close();

		System.out.println(outputStream);

	}
}
