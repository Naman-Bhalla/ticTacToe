import dev.naman.common.Constants;
import dev.naman.factory.PlayerFactory;
import dev.naman.model.Game;
import dev.naman.model.Player;
import dev.naman.strategy.HardComputerPlayingStrategy;

public class Client {
    public static void main(String[] args) {
        Game game = new Game.Builder().setDimensions(3, 3)
                .addOpponent(PlayerFactory.buildHumanPlayer().withUserId(123).build())
                .addOpponent(PlayerFactory.buildComputerPlayer().withDifficultyStrategy(
                        new HardComputerPlayingStrategy()).build()
                )
                .build();
        game.run();
    }
}
