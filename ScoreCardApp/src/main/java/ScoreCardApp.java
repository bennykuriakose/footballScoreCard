import Model.Match;

import java.util.*;
import java.util.stream.Collectors;

public class ScoreCardApp {
    private final Map<Integer, Match> matchMap = new LinkedHashMap<>();

    //Method to create and start match
    public void createMatch(int matchID, String homeTeam, String opponents) {
        //Add match to the map with score as 0 0
        matchMap.put(matchID, new Match(homeTeam, opponents, 0, 0));

    }

    public Match getMatchDetails(int MatchId) {
        return matchMap.get(MatchId);
    }

    //Method to finish match , remove match from the map
    public void finishMatch(int matchId) {
        //check if match exist in the system if so remove
        if (matchMap.containsKey(matchId)) {
            matchMap.remove(matchId);
        }
    }

    //updating match score based on the input
    public void updateScoreCard(int matchId, int homeScore, int opponentScore) {
        //check if match exist then update with latest score
        if (matchMap.containsKey(matchId)) {
            matchMap.get(matchId).setHomeScore(homeScore);
            matchMap.get(matchId).setOpponentScore(opponentScore);
        }
    }

    public List<Match> getMatchOverview() {
        //Sorting map based on the score total then reversing it to get based on decending total and input order last to first
        List<Match> matchList = matchMap.values().stream().sorted(Comparator.comparingInt(match -> (match.getHomeScore() + match.getOpponentScore())))
                .collect(Collectors.toList());
        Collections.reverse(matchList);
        return matchList;
    }
}
