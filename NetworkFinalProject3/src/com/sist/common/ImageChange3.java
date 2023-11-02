package com.sist.common;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageChange3 {
	public static Image getImage3(ImageIcon icon,int w, int h)
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}
}
