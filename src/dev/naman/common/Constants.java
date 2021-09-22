package dev.naman.common;

public interface Constants {
    enum Symbols {
        ZERO,
        CROSS,
    }

    enum PlayerStatus {
        IDLE,
        CURRENT_MOVE,
        WON,
        LOST,
        DRAW,
    }

    enum GameStatus {
        IN_PROGRESS,
        OVER,
    }

    enum PlayerType {
        HUMAN,
        COMPUTER,
    }
}
