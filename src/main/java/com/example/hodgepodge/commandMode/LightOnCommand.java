package com.example.hodgepodge.commandMode;

/**
 * @author yangpeng
 * @Classname LightOnCommand
 * @Description TODO
 * @Date 2020/12/20 2:24 下午
 */
public class LightOnCommand implements Command{
    LightOperation lightOperation;

    public LightOnCommand(LightOperation lightOperation) {
        this.lightOperation = lightOperation;
    }

    @Override
    public void execute() {
        lightOperation.on();
    }

    @Override
    public void recall() {
        lightOperation.off();
    }
}
