package com.example.hodgepodge.commandMode;

/**
 * @author yangpeng
 * @Classname LightOffCommand
 * @Description TODO
 * @Date 2020/12/20 2:24 下午
 */
public class LightOffCommand implements Command{
    LightOperation lightOperation;

    public LightOffCommand(LightOperation lightOperation) {
        this.lightOperation = lightOperation;
    }

    @Override
    public void execute() {
        lightOperation.off();
    }

    @Override
    public void recall() {
        lightOperation.on();
    }
}
