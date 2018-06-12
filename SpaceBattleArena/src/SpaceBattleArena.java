import ihs.apcs.spacebattle.TextClient;
import ihs.apcs.spacebattle.commands.RotateCommand;
/**
 * Created by jpverhaeghe on 4/29/2016.
 */
public class SpaceBattleArena {

    public static void main(String[] args) {
        String myServer = "10.56.65.169";
        String screenServer = "10.56.98.52";
        TextClient.run(myServer, new Survivor());

    }


}

