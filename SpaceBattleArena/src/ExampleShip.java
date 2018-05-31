import ihs.apcs.spacebattle.BasicEnvironment;
import ihs.apcs.spacebattle.BasicSpaceship;
import ihs.apcs.spacebattle.ObjectStatus;
import ihs.apcs.spacebattle.Point;
import ihs.apcs.spacebattle.RegistrationData;
import ihs.apcs.spacebattle.commands.*;

import java.awt.*;




public class ExampleShip extends BasicSpaceship {
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
        Point center = new Point((width / 2), (height / 2));
        ObjectStatus shipStatus = env.getShipStatus();
        Point shipPosition = shipStatus.getPosition();
        double currentDistanceFromCenter = shipPosition.getDistanceTo(center);
        int orientation = shipStatus.getOrientation();
        System.out.println(orientation);
        int getAngleFromCenter = shipPosition.getAngleTo(center)- orientation;
        System.out.println(currentDistanceFromCenter + "\n");
        System.out.println(getAngleFromCenter);
        ShipCommand returned = new RotateCommand(getAngleFromCenter);

        switch (baseState) {

            case THRUST:
                    baseState = States.STOP;
                    returned = new ThrustCommand('B', 1, .25);


            case STOP:
                if(currentDistanceFromCenter < 150){
                    baseState = States.STOP;
                    returned = new BrakeCommand(0);
                }

                else{
                    baseState = States.THRUST;
                }





            case ROTATE:
                if(getAngleFromCenter != 0) {
                    returned = new RotateCommand(getAngleFromCenter);
                }

                baseState = States.THRUST;
        }

        return returned;
    }

    public enum States {

        THRUST,
        ROTATE,
        STOP
    }
}
