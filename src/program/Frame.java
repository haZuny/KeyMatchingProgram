package program;
import java.awt.*;
import javax.swing.*;	// Swing GUI 사용
import javax.swing.border.EtchedBorder;

// Frame 객체 상속
public class Frame extends JFrame{

	// 생성자 정의
	public Frame() {
		// 윈도우 설정
		setSize(350,500);	// 황금비율(1:1.618)
		setTitle("Key Matching Program");
		setResizable(false); 	// 사이즈 수정 불가

		
		// Top
		JPanel topPanel = new JPanel();
		topPanel.setBorder(BorderFactory.createEmptyBorder(25,5,0,0));	// 패딩(상,우, 하, 좌)
		// 라벨
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
		// list 패널
		JPanel listPanel = new JPanel();
		listPanel.setBackground(new Color(244,244,244));
		listPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		// add
		midPanel.add(listPanel, BorderLayout.CENTER);
		add(midPanel, BorderLayout.CENTER);
		
		
		// Bottom
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,0,25,0));
		// 버튼
		JButton createBtn = new JButton("포인트 추가");
		// 라벨
		JLabel mailLabel = new JLabel("gkwns5791@naver.com");
		// add
		bottomPanel.add(mailLabel);
		bottomPanel.add(createBtn);
		add(bottomPanel, BorderLayout.SOUTH);

		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// x버튼 누르면 꺼짐
	}

	// 메인 메소드
	public static void main(String[] args) {
		// 윈도우 생성
		Frame frame = new Frame();
		
		// 윈도우 위치 설정
		Dimension frameSize = frame.getSize();	// 윈도우 크기
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	// 모니터 크기
	    frame.setLocation((screenSize.width - frameSize.width) /2, (screenSize.height - frameSize.height) /2);
	    
	}

}
