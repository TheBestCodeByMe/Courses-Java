package cosmodrome;

import cosmodrome.ships.Shuttle;
import cosmodrome.ships.SpaceX;

public class Main {
    public static void main(String[] args) {
        Cosmodrome ship = new Cosmodrome();

        Shuttle shuttle = new Shuttle();
        ship.startup(shuttle);

        SpaceX spaceX = new SpaceX();
        ship.startup(spaceX);
        ship.startup(spaceX);
        ship.startup(spaceX);
    }
}
