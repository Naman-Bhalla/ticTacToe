package dev.naman.model;

import dev.naman.common.Constants;

public abstract class Player {
    private int game_id;
    private Constants.Symbols symbol;
    private Constants.PlayerStatus status;

    public int getGame_id() {
        return game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public Constants.Symbols getSymbol() {
        return symbol;
    }

    public void setSymbol(Constants.Symbols symbol) {
        this.symbol = symbol;
    }

    public Constants.PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(Constants.PlayerStatus status) {
        this.status = status;
    }
}
