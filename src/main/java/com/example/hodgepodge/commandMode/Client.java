package com.example.hodgepodge.commandMode;

/**
 * @author yangpeng
 * @Classname Client
 * @Description TODO
 * @Date 2020/12/20 2:52 下午
 */
public class Client {
    public static void main(String[] args) {
        LightOperation lightOperation = new LightOperation();
        LightOnCommand lightOnCommand = new LightOnCommand(lightOperation);
        LightOffCommand lightOffCommand = new LightOffCommand(lightOperation);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.onButton(0);
        remoteControl.offButton(0);
    }
}
