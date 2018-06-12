import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.Point;
import ihs.apcs.spacebattle.commands.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


//http://mikeware.github.io/SpaceBattleArena/client/java_doc/index.html?ihs/apcs/spacebattle/commands/package-summary.html
    public class Survivor extends BasicSpaceship {
        private int width;
        private int height;
        private States baseState= States.RADAR;
        private RadarResults radarResults;
        private List asteroids;

        @Override


        public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight) {
            height = worldHeight;
            width = worldWidth;
            return new RegistrationData("Peace Ship", new Color(0, 160, 171), 0);


        }



        @Override
        public ShipCommand getNextCommand(BasicEnvironment env) {
            ObjectStatus shipStatus = env.getShipStatus();
            Point shipPosition = shipStatus.getPosition();
            int radarRange = shipStatus.getRadarRange();
            int numObs;


            ShipCommand returned = new RadarCommand(4);

            switch (baseState) {

                case RADAR:
                    returned = new RadarCommand(4);
                    radarResults = env.getRadar();
                    asteroids = radarResults.getByType("Asteroid");
                    System.out.println();

                    break;

                case THRUST:
                    baseState = States.ROTATE;
                    returned = new ThrustCommand('B', 1, .5);
                    break;




                case STOP:
                        returned = new BrakeCommand(0);
                        break;


                case MINE:
                    baseState = States.THRUST;
                    returned = new DeploySpaceMineCommand( 1);
                    break;


                case ROTATE:

                        returned = new RotateCommand(100);


                    baseState = States.MINE;
            }

            return returned;
        }

        public enum States {

            THRUST,
            ROTATE,
            STOP,
            MINE,
            RADAR
        }}

