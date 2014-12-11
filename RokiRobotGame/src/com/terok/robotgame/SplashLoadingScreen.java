package com.terok.robotgame;

import com.terok.framework.Game;
import com.terok.framework.Graphics;
import com.terok.framework.Graphics.ImageFormat;
import com.terok.framework.Screen;

public class SplashLoadingScreen extends Screen {

	public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.splash= g.newImage("splash2.jpg", ImageFormat.RGB565);

        
        game.setScreen(new LoadingScreen(game));

    }

    @Override
    public void paint(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }

}
