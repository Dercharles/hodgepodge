package com.example.hodgepodge.commandMode;

/**
 * @author yangpeng
 * @Classname RemoteControl
 * @Description TODO
 * @Date 2020/12/20 2:25 下午
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    private Command unCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];

        for (int i=0;i < 3 ;i++){
            onCommands[i] = new NOCommand();
            offCommands[i] = new NOCommand();
        }
    }

    public void setCommand(int o,Command onCommand,Command offCommand){
        onCommands[o] = onCommand;
        offCommands[o] = offCommand;
    }

    public void onButton(int on){
        Command onCommand = onCommands[on];
        onCommand.execute();
        unCommand = onCommand;
    }

    public void offButton(int on){
        Command onCommand = offCommands[on];
        onCommand.execute();
        unCommand = onCommand;
    }

    public void undo(){
        unCommand.recall();
    }

}
