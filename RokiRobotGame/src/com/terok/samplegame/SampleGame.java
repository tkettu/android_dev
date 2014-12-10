package com.terok.samplegame;

import com.terok.framework.Screen;
import com.terok.framework.implemantation.AndroidGame;

public class SampleGame extends AndroidGame {
	
	@Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
	 
	 @Override
	 public void onBackPressed(){
		 getCurrentScreen().backButton();
	 }

}
