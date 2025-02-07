package Scripts;

import java.util.ArrayList;
import Level.Script;
import ScriptActions.*;

public class LockedDoorScript extends Script {
    @Override
    public ArrayList<ScriptAction> loadScriptActions() {
        ArrayList<ScriptAction> scriptActions = new ArrayList<>();

        scriptActions.add(new ChangeFlagScriptAction("lockedDoor", true));
        scriptActions.add(new TextboxScriptAction() {{
            addText("This door appears to be locked");
        }});

        return scriptActions;
    }   
}