import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCardAppTest {

    //Test to test create Match method
    @Test
    public void startMatchTest()
    {
        ScoreCardApp scoreCardApp=new ScoreCardApp();
        createMatch(scoreCardApp);
        assertEquals("Mexico",scoreCardApp.getMatchDetails(1).getHome());
    }
    //To test finish match method
    @Test
    public void finishMatch(){
        ScoreCardApp scoreCardApp=new ScoreCardApp();
        createMatch(scoreCardApp);
        scoreCardApp.finishMatch(1);
        assertEquals(null,scoreCardApp.getMatchDetails(1));
    }

    @Test
    public void updateScoreCard()
    {
        ScoreCardApp scoreCardApp=new ScoreCardApp();
        createMatch(scoreCardApp);
        scoreCardApp.updateScoreCard(1,2,3);
        assertEquals(2,scoreCardApp.getMatchDetails(1).getHomeScore());

    }

    private void createMatch(ScoreCardApp scoreCardApp) {
        scoreCardApp.createMatch(1,"Mexico","Canada");
    }
}
