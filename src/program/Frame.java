package program;
import java.awt.*;
import javax.swing.*;	// Swing GUI ���
import javax.swing.border.EtchedBorder;

// Frame ��ü ���
public class Frame extends JFrame{

	// ������ ����
	public Frame() {
		// ������ ����
		setSize(350,500);	// Ȳ�ݺ���(1:1.618)
		setTitle("Key Matching Program");
		setResizable(false); 	// ������ ���� �Ұ�

		
		// Top
		JPanel topPanel = new JPanel();
		topPanel.setBorder(BorderFactory.createEmptyBorder(25,5,0,0));	// �е�(��,��, ��, ��)
		// ��
		Font titleFont = new Font("", Font.PLAIN, 25);
		JLabel title = new JLabel("Key Matching Program");
		title.setFont(titleFont);
		// add
		topPanel.add(title);
		add(topPanel, BorderLayout.NORTH);
		
		
		// Mid
		JPanel midPanel = new JPanel();
		midPanel.setLayout(new BorderLayout());
		midPanel.setBorder(BorderFactory.createEmptyBorder(0,25,0,25));
		// list �г�
		JPanel listPanel = new JPanel();
		listPanel.setBackground(new Color(244,244,244));
		listPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		// add
		midPanel.add(listPanel, BorderLayout.CENTER);
		add(midPanel, BorderLayout.CENTER);
		
		
		// Bottom
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,0,25,0));
		// ��ư
		JButton createBtn = new JButton("����Ʈ �߰�");
		// ��
		JLabel mailLabel = new JLabel("gkwns5791@naver.com");
		// add
		bottomPanel.add(mailLabel);
		bottomPanel.add(createBtn);
		add(bottomPanel, BorderLayout.SOUTH);

		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// x��ư ������ ����
	}

	// ���� �޼ҵ�
	public static void main(String[] args) {
		// ������ ����
		Frame frame = new Frame();
		
		// ������ ��ġ ����
		Dimension frameSize = frame.getSize();	// ������ ũ��
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// ����� ũ��
	    frame.setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
	    
	}

}
