package de.jvpichowski.htftf.protocol.game;

import com.thoughtworks.xstream.XStream;
import de.jvpichowski.htftf.protocol.base.RoomPacket;
import de.jvpichowski.htftf.protocol.htftf.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.Arrays;

public class GameResultTest {

	private XStream xstream;
	private ByteArrayOutputStream outputStream;
	private ObjectOutputStream stream;

	@Before public void prepareXStream() throws IOException {
		xstream = new XStream();
		outputStream = new ByteArrayOutputStream();
		stream = xstream.createObjectOutputStream(outputStream, "protocol");
	}

	@Test public void testFullGameResultSerialization() throws IOException {
		xstream.processAnnotations(RoomPacket.class);
		xstream.processAnnotations(GameResult.class);
		xstream.processAnnotations(Team.class);
		var roomPacket = new RoomPacket("ROOM_ID", new GameResult(
			new ScoreDefinition(Arrays.asList(
					new ScoreFragment("Gewinner", ScoreAggregation.SUM, true),
					new ScoreFragment("∅ Punkte", ScoreAggregation.AVERAGE, true)
			)),
			Arrays.asList(
					new PlayerScore(ScoreCausa.REGULAR, "R1", Arrays.asList(
							new BigDecimal(1), new BigDecimal(3))),
					new PlayerScore(ScoreCausa.REGULAR, "R1", Arrays.asList(
							new BigDecimal(2), new BigDecimal(4)))
			),
			Arrays.asList(new Player("NAME", Team.Blue))
		));
		stream.writeObject(roomPacket);
		stream.close();
		String actual = outputStream.toString();

		String expected =
"""
<protocol>
  <room roomId="ROOM_ID">
    <data class="result">
      <definition>
        <fragment name="Gewinner">
          <aggregation>SUM</aggregation>
          <relevantForRanking>true</relevantForRanking>
        </fragment>
        <fragment name="∅ Punkte">
          <aggregation>AVERAGE</aggregation>
          <relevantForRanking>true</relevantForRanking>
        </fragment>
      </definition>
      <score cause="REGULAR" reason="R1">
        <part>1</part>
        <part>3</part>
      </score>
      <score cause="REGULAR" reason="R1">
        <part>2</part>
        <part>4</part>
      </score>
      <winner displayName="NAME">
        <color class="team">Blue</color>
      </winner>
    </data>
  </room>
</protocol>""";

		Assert.assertEquals(expected, actual);
	}
}
