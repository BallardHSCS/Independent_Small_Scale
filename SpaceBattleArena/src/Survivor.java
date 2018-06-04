import ihs.apcs.spacebattle.*;
import ihs.apcs.spacebattle.Point;
import ihs.apcs.spacebattle.commands.*;

import java.awt.*;


//http://mikeware.github.io/SpaceBattleArena/client/java_doc/index.html?ihs/apcs/spacebattle/commands/package-summary.html
    public class Survivor extends BasicSpaceship {
        private int width;
        private int height;
        private States baseState= States.FIRE;
        private RadarResults radar;

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
            int orientation = shipStatus.getOrientation();
            System.out.println(orientation);

            ShipCommand returned = new FireTorpedoCommand('F');

            switch (baseState) {

                case THRUST:
                    baseState = States.ROTATE;
                    return new ThrustCommand('B', 1, .25);




                case STOP:
                        returned = new BrakeCommand(0);


                case FIRE:
                    baseState = States.THRUST;
                    return new DeploySpaceMineCommand(4);



                case ROTATE:

                        returned = new RotateCommand(orientation -100);


                    baseState = States.FIRE;
            }

            return returned;
        }

        public enum States {

            THRUST,
            ROTATE,
            STOP,
            FIRE
        }}

