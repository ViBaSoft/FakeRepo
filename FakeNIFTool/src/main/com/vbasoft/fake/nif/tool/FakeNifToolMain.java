package com.vbasoft.fake.nif.tool;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingUtilities;

public class FakeNifToolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FakeNifToolMain main = new FakeNifToolMain();
//		main.show();
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				FakeNifToolMain main = new FakeNifToolMain();
				main.show();
			}
			
		});
	}

	public void show() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Fake NIF Tool");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		
		frame.setSize(400, 300);
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST );
		frame.add(centerPanel, BorderLayout.CENTER);
		
		JTree tree = new JTree();
		leftPanel.add(tree);
		
		JTextArea traceArea = new JTextArea("Just some text to trace...");
		centerPanel.add(traceArea);
		
		JButton btnOne = new JButton("One");
		JButton btnTwo = new JButton("Two");
		JButton btnThree = new JButton("Three");
		
		BoxLayout boxLayout = new BoxLayout(rightPanel, BoxLayout.PAGE_AXIS);

		rightPanel.add(btnOne);
		rightPanel.add(btnTwo);
		rightPanel.add(btnThree);
		
		
		frame.validate();
		frame.pack();
		frame.setVisible(true);
		
//		frame.show();
		
	}

}

