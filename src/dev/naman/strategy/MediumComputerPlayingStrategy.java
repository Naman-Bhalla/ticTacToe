package dev.naman.strategy;

import dev.naman.model.Board;
import dev.naman.model.Coordinates;

public class MediumComputerPlayingStrategy implements ComputerPlayingStrategy {
    @Override
    public Coordinates getNextMove(Board board) {
        Coordinates c = new Coordinates();
        c.setX(1);
        c.setY(1);
        return c;
    }
}
