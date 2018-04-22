package tw.controllers;

import com.google.inject.Inject;
import tw.core.Game;
import tw.commands.InputCommand;
import tw.core.model.GuessResult;
import tw.views.GameView;

import java.io.IOException;


public class GameController {
    private final Game game;
    private final GameView gameView;

    @Inject
    public GameController(Game game, GameView gameView) {
        this.game = game;
        this.gameView = gameView;
    }

    public void beginGame() throws IOException {
        gameView.showBegin();
    }

    public void play(InputCommand command) throws IOException {
        if (!game.checkCoutinue()) {
            gameView.showGameStatus(game.checkStatus());
        } else {
            gameView.showGuessResult(game.guess(command.input()));
            gameView.showGuessHistory(game.guessHistory());
            play(command);
        }
    }

}
