/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warlux.domain.objetos;

import com.warlux.domain.objetos.items.Item;
import java.awt.Rectangle;

/**
 *
 * @author Warlux
 */
public class ItemSuelto{

    private int x;
    private int y;
    private Item item;
    
    public ItemSuelto(int x, int y, Item item) {
        this.x = x;
        this.y = y;
        this.item = item;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, 40, 40);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Item getItem() {
        return item;
    }
}
