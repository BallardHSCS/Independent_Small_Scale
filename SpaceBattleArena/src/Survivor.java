import ihs.apcs.spacebattle.BasicEnvironment;
import ihs.apcs.spacebattle.BasicSpaceship;
import ihs.apcs.spacebattle.ObjectStatus;
import ihs.apcs.spacebattle.Point;
import ihs.apcs.spacebattle.RegistrationData;
import ihs.apcs.spacebattle.commands.BrakeCommand;
import ihs.apcs.spacebattle.commands.RotateCommand;
import ihs.apcs.spacebattle.commands.ShipCommand;
import ihs.apcs.spacebattle.commands.ThrustCommand;

import java.awt.*;

public class Survivor {

//http://mikeware.github.io/SpaceBattleArena/client/java_doc/index.html?ihs/apcs/spacebattle/commands/package-summary.html


/*   public class ExampleShip extends BasicSpaceship {
        private int width;
        private int height;
        private States baseState= States.ROTATE;
        @Override
        public RegistrationData registerShip(int numImages, int worldWidth, int worldHeight) {
            height = worldHeight;
            width = worldWidth;
            return new RegistrationData("Gran Kippler", new Color(0, 160, 171), 0);


        }

        @Override
        public ShipCommand getNextCommand(BasicEnvironment env) {

            ObjectStatus shipStatus = env.getShipStatus();
            ihs.apcs.spacebattle.Point shipPosition = shipStatus.getPosition();
            ihs.apcs.spacebattle.Point center = new Point((width / 2), (height / 2));

            double getDistanceFromCenter = shipPosition.getDistanceTo(center);
            int orientation = shipStatus.getOrientation();
            System.out.println(getDistanceFromCenter + "\n");
            int getAngleFromCenter = shipPosition.getAngleTo(center);
            System.out.println(getAngleFromCenter);
            ShipCommand returned = new RotateCommand(getAngleFromCenter);

            switch (baseState) {

                case THRUST:

                    if (getDistanceFromCenter <= 50)
                    {
                        baseState = States.STOP;
                    }
                    return new ThrustCommand('F', getDistanceFromCenter, 1.0);

                case STOP:

                    returned = new BrakeCommand(0);


                case ROTATE:
                    if(getAngleFromCenter != 0) {
                        returned = new RotateCommand(getAngleFromCenter - orientation);
                    }

                    baseState = States.THRUST;
            }

            return returned;
        }

        public enum States {

            THRUST,
            STOP,
            ROTATE
        }
    }
}
*/}