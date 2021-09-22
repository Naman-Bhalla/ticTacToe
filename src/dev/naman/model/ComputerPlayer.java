package dev.naman.model;

import dev.naman.strategy.ComputerPlayingStrategy;

public class ComputerPlayer extends Player {
    private ComputerPlayingStrategy strategy;

    public ComputerPlayingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ComputerPlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public static class Builder {
        private ComputerPlayer player;

        public Builder() {
            this.player = new ComputerPlayer();
        }

        public Builder withDifficultyStrategy(ComputerPlayingStrategy strategy) {
            this.player.setStrategy(strategy);
            return this;
        }

        public ComputerPlayer build() {
            return this.player;
        }
    }
}
