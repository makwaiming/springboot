package com.omega.commons.constants;

/**
 * Created by songleo on 2016-05-18.
 */
public class PlayNGoFreeGame {
    private String gameId;
    private String gameName;
    private String[] lines;
    private String[] coins;
    private String[] denominations;

    public void PlayNGoFreeGame() {
    }

    public PlayNGoFreeGame (String gameId, String gameName, String[] lines, String[] coins, String[] denominations) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.lines = lines;
        this.coins = coins;
        this.denominations = denominations;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }

    public String[] getCoins() {
        return coins;
    }

    public void setCoins(String[] coins) {
        this.coins = coins;
    }

    public String[] getDenominations() {
        return denominations;
    }

    public void setDenominations(String[] denominations) {
        this.denominations = denominations;
    }

}
