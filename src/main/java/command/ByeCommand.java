package command;

import duke.Ui;
import duke.TaskList;

public class ByeCommand extends Command {
    private TaskList taskList;
    private Ui ui;
    public ByeCommand(TaskList taskList, Ui ui) {
        super(taskList, ui);
    }

    @Override
    public void execute(TaskList taskList, Ui ui) {
        ui.showGoodbye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
