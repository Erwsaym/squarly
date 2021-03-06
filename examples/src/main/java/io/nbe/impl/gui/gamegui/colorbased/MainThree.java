package io.nbe.impl.gui.gamegui.colorbased;

import io.nbe.squarly.model.Cord;
import io.nbe.squarly.model.GameGenerator;

/**
 * @author Nicolas Beaussart
 * @since 27/10/16
 */
public class MainThree {
    public static void main(String... args){
        GameMap gm ;
        gm = new GameMap(60, 60, 20, 20);
        for (int y = 0; y < gm.sizeY(); y++) {
            for (int x = 0; x < gm.sizeX(); x++) {
                gm.add(new GameSquare(null, Cord.get(x,y), gm));

            }
        }
        new GameGenerator<GameSquare>(gm, true).useMazeGeneratorClean().generate();
        System.out.println("Done");
    }
}
