package com.example.hodgepodge.outward;

/**
 * @author yangpeng
 * @Classname MovieTheater
 * @Description TODO
 * @Date 2020/12/5 1:03 上午
 */
public class MovieTheater {
    private Curtain curtain;
    private Popcorn popcorn;
    private Projector projector;

    public MovieTheater() {
        this.curtain = Curtain.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
    }

    public void MovieBegins(){
        projector.open();
        curtain.close();
        popcorn.makingPopcorn();
    }

    public void movieEnd(){
        projector.close();
        curtain.open();
        popcorn.CleaningThePopcornMachine();
    }
}
