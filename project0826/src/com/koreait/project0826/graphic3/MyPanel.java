package com.koreait.project0826.graphic3;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;


//그림을 그려넣기 위한 커스텀 패널
public class MyPanel extends JPanel{
	Toolkit kit = Toolkit.getDefaultToolkit();
	Image[] img = new Image[7];
	int index;
	public MyPanel() {
		img[0] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img0.jpg");
		img[1] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img1.jpg");
		img[2] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img2.jpg");
		img[3] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img3.jpg");
		img[4] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img4.jpg");
		img[5] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img5.jpg");
		img[6] = kit.getImage("D:\\bigData\\workspaceOfJava2\\project0826\\img\\shurek\\img6.jpg");
	}
	@Override
	public void paint(Graphics g) {
		
		g.drawImage(img[index], 0, 0, 500, 340, this);
	}
}
