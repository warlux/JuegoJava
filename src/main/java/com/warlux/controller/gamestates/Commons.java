package com.warlux.controller.gamestates;

public interface Commons {
	
	enum GameState {IntroScreen, MenuScreen, Pause, Playing, GameOver, Overworld, NivelCompleto};
	
	enum PlayingState {Preparacion, Juego, AnimacionSalto};
}