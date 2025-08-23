package org.example;

public class RemoteController {

    private final Light light;
    private final AC ac;
    private final GarageDoor garageDoor;
    private final MusicPlayer musicPlayer;
    private final WindowBlind windowBlind;

    public RemoteController() {
        this.light = new Light();
        this.ac = new AC();
        this.garageDoor = new GarageDoor();
        this.musicPlayer = new MusicPlayer();
        this.windowBlind = new WindowBlind();
    }

    public void pressOnButton1(){
        light.on();
    }

    public void pressOffButton1(){
        light.off();
    }

    public void pressOnButton2(){
        ac.on();
    }

    public void pressOffButton2(){
        ac.off();
    }

    public void pressOnButton3() {
       garageDoor.open();
    }

    public void pressOffButton3() {
        garageDoor.close();
    }

    public void pressOnButton4() {
        musicPlayer.on();
        musicPlayer.tuneIn();
        musicPlayer.cueItUpByMyFavoriteMusic();
        musicPlayer.play();
    }

    public void pressOffButton4() {
        musicPlayer.off();
    }

    public void pressOnButton5() {
        windowBlind.open();
    }

    public void pressOffButton5() {
        windowBlind.draw();
    }
}
