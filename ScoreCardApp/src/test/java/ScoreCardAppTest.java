import Model.Match;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    @Test
    public void getMatchOverviewTest(){
        ScoreCardApp scoreCardApp=new ScoreCardApp();
        createMultipleMatch(scoreCardApp);
        scoreCardApp.updateScoreCard(1,0,5);
        scoreCardApp.updateScoreCard(3,10,2);
        scoreCardApp.updateScoreCard(7,2,2);
        scoreCardApp.updateScoreCard(4,6,6);
        scoreCardApp.updateScoreCard(2,3,1);
        List<Match> matchList=scoreCardApp.getMatchOverview();
        assertEquals("Uruguay",matchList.get(0).getHome());
        assertEquals("Italy",matchList.get(0).getOpponent());
        assertEquals("Spain",matchList.get(1).getHome());
        assertEquals("Brazil",matchList.get(1).getOpponent());
        assertEquals("Germany",matchList.get(4).getHome());
        assertEquals("France",matchList.get(4).getOpponent());
    }

    private void createMatch(ScoreCardApp scoreCardApp) {
        scoreCardApp.createMatch(1,"Mexico","Canada");
    }
    private void createMultipleMatch(ScoreCardApp scoreCardApp)
    {
        scoreCardApp.createMatch(1,"Mexico","Canada");
        scoreCardApp.createMatch(3,"Spain","Brazil");
        scoreCardApp.createMatch(7,"Germany","France");
        scoreCardApp.createMatch(4,"Uruguay","Italy");
        scoreCardApp.createMatch(2,"Argentina","Australia");
    }
}
