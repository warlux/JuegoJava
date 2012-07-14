package com.warlux.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.warlux.domain.objetos.Puntero;

public class Listener extends KeyAdapter{
    
	private Puntero puntero;
	
	public Listener(Puntero puntero){
		this.puntero = puntero;
	}
	
	
	@Override
    public void keyPressed(KeyEvent e){
        puntero.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e){
    	puntero.keyReleased(e);
    }
}
