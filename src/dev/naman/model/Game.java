package dev.naman.model;

import dev.naman.common.Constants;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Constants.GameStatus status;
    private int currentMove;
    private int game_id;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Constants.GameStatus getStatus() {
        return status;
    }

    public void setStatus(Constants.GameStatus status) {
        this.status = status;
    }

    public int getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(int currentMove) {
        this.currentMove = currentMove;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public void run() {
        while (true) {}
    }

    public static class Builder {
        private Game game;

        public Builder() {
            this.game = new Game();
        }

        public Builder addOpponent(Player p) {
            this.game.getPlayers().add(p);
            return this;
        }

        public Builder setDimensions(int rows, int columns) {
            this.game.getBoard().setState(new ArrayList<>(rows));
            for (int i = 0; i < columns; ++i) {
                this.game.getBoard().getState().set(i, new ArrayList<>(columns));
            }
            return this;
        }

        public Game build() {
            return this.game;
        }

    }
}
