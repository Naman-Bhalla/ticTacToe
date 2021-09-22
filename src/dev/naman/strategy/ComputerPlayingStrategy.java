package dev.naman.strategy;

import dev.naman.model.Board;
import dev.naman.model.Coordinates;

public interface ComputerPlayingStrategy {

    public Coordinates getNextMove(Board board);
}
