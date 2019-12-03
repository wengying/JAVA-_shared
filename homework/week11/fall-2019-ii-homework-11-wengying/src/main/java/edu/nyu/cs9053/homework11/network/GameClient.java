package edu.nyu.cs9053.homework11.network;

import edu.nyu.cs9053.homework11.game.Difficulty;
import edu.nyu.cs9053.homework11.game.GameProvider;

import java.io.*;

/**
 * User: blangel
 *
 * A blocking IO implementation of a client which requests moves from a remote server implementing the
 * {@linkplain edu.nyu.cs9053.homework11.network.NetworkGameProvider}
 */
public class GameClient implements GameProvider {

    public static GameClient construct(Difficulty difficulty) {
        // TODO - construct and return the GameClient - do not keep this comment in your code
    }

    public GameClient(Difficulty difficulty, InputStream serverInput, OutputStream serverOutput) {
    }

}
