import Model.Match;

import java.util.HashMap;
import java.util.Map;

public class ScoreCardApp {
    private final Map<Integer, Match> matchMap = new HashMap<>();

    //Method to create and start match
//Create Entry in to the map when match start
    public void createMatch(int matchID, String homeTeam, String opponents) {
        //Add match to the map with score as 0 0
        matchMap.put(matchID, new Match(homeTeam, opponents, 0, 0));

    }

    public Match getMatchDetails(int MatchId) {
        return matchMap.get(MatchId);
    }

    //Method to finish match , remove match from the map
    public void finishMatch(int matchId) {
        if (matchMap.containsKey(matchId)){
            matchMap.remove(matchId);
        }
    }
//updating match score based on the input
    public void updateScoreCard(int matchId, int homeScore, int opponentScore) {
        if (matchMap.containsKey(matchId)) {
            matchMap.get(matchId).setHomeScore(homeScore);
            matchMap.get(matchId).setOpponentScore(opponentScore);
        }
    }
}
