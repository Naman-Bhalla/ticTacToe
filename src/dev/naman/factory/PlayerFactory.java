package dev.naman.factory;

import dev.naman.common.Constants;
import dev.naman.model.ComputerPlayer;
import dev.naman.model.HumanPlayer;
import dev.naman.model.Player;

public class PlayerFactory {
    public static HumanPlayer.Builder buildHumanPlayer() {
        return new HumanPlayer.Builder();
    }

    public static ComputerPlayer.Builder buildComputerPlayer() {
        return new ComputerPlayer.Builder();
    }
}
