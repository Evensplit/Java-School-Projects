package ch10Ex6;

public class LittleLeagueBaseballGame extends BaseballGame
{
    private final int INNINGS = 6;
    //constructor for class
    public LittleLeagueBaseballGame()
    {
        scores = new int[2][INNINGS];
        for(int t = 0; t < scores.length; ++t)
            for(int i = 0; i < scores[t].length; ++i)
                scores[t][i] = UNPLAYED;
    }
    @Override
    //override get innings method
    public int getInnings()
    {
        return INNINGS;
    }
}