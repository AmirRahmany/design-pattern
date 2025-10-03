package org.example;

import org.example.version1.*;

//client
public class HomeAutomationApp {

    public static void main(String[] args) {
        final RemoteController remoteController = new RemoteController();
        configRemoteController(remoteController);

        System.out.println("Light");
        remoteController.pressOnButton(0);
        remoteController.pressOffButton(0);

        System.out.println("--------------------------");
        System.out.println("Air Conditioner System");
        remoteController.pressOnButton(1);
        remoteController.pressOffButton(1);

        System.out.println("--------------------------");
        System.out.println("Music Player");
        remoteController.pressOnButton(4);
        remoteController.pressOffButton(4);
    }

    private static void configRemoteController(RemoteController remoteController) {
        // receivers
        final Light light = new Light();
        final AC ac = new AC();
        final GarageDoor garageDoor = new GarageDoor();
        final WindowBlind windowBlind = new WindowBlind();
        final MusicPlayer musicPlayer = new MusicPlayer();

        //set command object as lambda expression
        remoteController.setCommand(0, light::on, light::off);
        remoteController.setCommand(1, ac::on, ac::off);
        remoteController.setCommand(2, garageDoor::open, garageDoor::close);
        remoteController.setCommand(3, windowBlind::open, windowBlind::draw);
        remoteController.setCommand(4, () -> turnOnMusicPlayer(musicPlayer), musicPlayer::off);
    }

    private static void turnOnMusicPlayer(MusicPlayer musicPlayer) {
        musicPlayer.on();
        musicPlayer.tuneIn();
        musicPlayer.cueItUpByMyFavoriteMusic();
        musicPlayer.play();
    }
}
