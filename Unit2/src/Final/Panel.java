package Final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{
 
 //�]�w���ʡ]�����^���
    private int Panel_Width = 600;
    private int Panel_Height = 600;
    
    private int Body_Size = 50;
    private int Body_Total = 900;
    
    //���ʳt�סA���@��
    private int Speed;

    private int x[] = new int[Body_Total];
    private int y[] = new int[Body_Total];

    private int body_tmp;
    private int apple_x;
    private int apple_y;

    //�w�]�_�l��m�¥k��
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    
    //�P�_�O�_ game over
    private boolean inGame = false;
    private boolean Gamestart = false;
    private boolean Gamepause = false;

    private Timer timer;
    private Image body_img;
    private Image body_img2;
    private Image body_img3;
    private Image apple_img;
    private Image head_img0;
    private Image head_img1;
    private Image head_img2;
    private Image head_img3;
    private Image gress_img;

    private panaladd panaladd;
    private int difficulty = 1;
    public int hits = 0;
    private float atime;
    
    public Panel() {
        addKeyListener(new Key_Detect());
        setBackground(Color.black);
        setFocusable(true);
        //setSize �� setPreferredSize �����W���n�����t
        setPreferredSize(new Dimension(Panel_Width, Panel_Height));
        loadImages();
        
        timer = new Timer(Speed, this);
        initGame();
    }

    private void loadImages() {
        ImageIcon b = new ImageIcon("src/Final/resources/body.png");
        body_img = b.getImage();

        ImageIcon a = new ImageIcon("src/Final/resources/apple.png");
        apple_img = a.getImage();

        ImageIcon h = new ImageIcon("src/Final/resources/head0.png");
        head_img0 = h.getImage();
        h = new ImageIcon("src/Final/resources/head1.png");
        head_img1 = h.getImage();
        h = new ImageIcon("src/Final/resources/head2.png");
        head_img2 = h.getImage();
        h = new ImageIcon("src/Final/resources/head3.png");
        head_img3 = h.getImage();
        
        ImageIcon c = new ImageIcon("src/Final/resources/gress.jpg");
        gress_img = c.getImage();
        
        ImageIcon d = new ImageIcon("src/Final/resources/body2.png");
        body_img2 = d.getImage();
        
        ImageIcon e = new ImageIcon("src/Final/resources/body3.png");
        body_img3 = e.getImage();
    }

    private void initGame() {
    	//����`�ơ]�o�i�H���Ӷ}�o�����׽վ�A��t�פ@�ˡ^
    	//���ʳt��
		Speed = 140;
		inGame = false;
        Gamestart = false;
        Gamepause = false;
        difficultyset();
		atime = 300;
		hits=0;
		
        for (int z = 0; z < body_tmp; z++) {
            x[z] = Panel_Width/2 - z * 10;
            y[z] = Panel_Height/2;
        }
        
        //��m�Ĥ@��ī�G
        locateapple();
        //ActionListener listener�N�O�o��class
        timer.setDelay(Speed);
        timer.start();
    }
    
    //��ӹC���i��D�K�F
    	@Override
    	public void actionPerformed(ActionEvent e) {

        	repaint();
    	}

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    
    //�e��
    private void doDrawing(Graphics g) {
    	//�פJ�Ť���class
    	panaladd = new panaladd(g,Panel_Width, Panel_Height);
    	//�e�}�l�e��
        if(Gamestart==false) {
        	//ø�s�e��
        	//g.drawImage(gress_img, 0, 0, this);
			panaladd.startimg();
			//�g�X���׻P���D�P�p�ɡA�ɶ���۰ʶ}�l�C��
			panaladd.printdif(difficulty);
			difficultyset();
        }else {
        	inGame = true;
        	Gamestart = true;
        }
        //�C���P�_
        if(Gamepause == true) {
        	Gamedraw(g);
        	panaladd.pauseimg();
        }else {
        	if (inGame == true) {
        		checkapple();//�ˬd�Y��ī�G�F�S
        		checkCollision();//���S���I�������
            	move();
        	}
        	//�p�G�٦b�C���̭�
        	if (Gamestart==true && inGame==true && atime> 0) {
        		Gamedraw(g);
        	}
        	if (Gamestart==true && inGame==false || atime<= 0){
        		gameOver(g);
        	}
        }
    }

    //�C�������e��
    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Roboto", Font.BOLD, 24);
        FontMetrics metr = getFontMetrics(small);
        
        g.drawImage(gress_img, 0, 0,Panel_Width,Panel_Height,null);
        g.setColor(Color.red);
    	g.fillRect(0,Panel_Height/2-100,Panel_Width,200);
    	
        g.setColor(Color.black);
        g.setFont(small);
        g.drawString(msg, (Panel_Width- metr.stringWidth(msg)) / 2 , Panel_Height / 2-10);
        
        g.setColor(Color.black);
        g.setFont(new Font("Monospaced", Font.BOLD, 24));
        g.drawString("�̲פ���: " + hits, Panel_Width/2-60, Panel_Height/2+50);
        
        g.setColor(Color.white);
        g.setFont(new Font("Monospaced",Font.BOLD,24));
        g.drawString("Press R to restart", Panel_Width/2-80, Panel_Height-100);
        timer.stop();
    }
    
    //�e�X�C���e��
    private void Gamedraw(Graphics g) {
    	g.drawImage(gress_img, 0, 0,Panel_Width,Panel_Height,null);
        g.drawImage(apple_img, apple_x, apple_y, this);
        for (int z = 0; z < body_tmp; z++) {
        	//���e�X�Y
            if (z == 0) {
            	if(downDirection) {
            		g.drawImage(head_img0, x[z], y[z], this);
            	}else if(rightDirection) {
            		g.drawImage(head_img1, x[z], y[z], this);
            	}else if(upDirection) {
            		g.drawImage(head_img2, x[z], y[z], this);
            	}else if(leftDirection) {
            		g.drawImage(head_img3, x[z], y[z], this);
            	}
                
            } else if(z == body_tmp-1){
            	//����
            	g.drawImage(body_img, x[z], y[z], this);
            }else{
            //�b�e�X����
            	if(z%2==0) {
            		//���ƨ���
            		g.drawImage(body_img, x[z], y[z], this);
            	}else {
            		//��ƨ���
            		g.drawImage(body_img, x[z], y[z], this);
            	}
            }
        }
        g.setColor(Color.white);
		g.setFont(new Font("Monospaced",Font.BOLD,24));
		g.drawString(((int)atime/10) + "s",Panel_Width-50,Panel_Height-50 );
	    atime -= Speed/100;
    }
    
    //�ˬd�W�G��Ĳ
    private void checkapple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            body_tmp++;
            locateapple();
            hits+=1;
            //�Y��ī�G�|�[�t
            Speed-=5;
            timer.setDelay(Speed);
        }
        for(int i=0;i<body_tmp;i++) {
        	if ((x[i] == apple_x) && (y[i] == apple_y)) {
                locateapple();
            }
        }
    }

    private void move() {
        for (int z = body_tmp; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }
        if (leftDirection) {
            x[0] -= Body_Size;
        }
        if (rightDirection) {
            x[0] += Body_Size;
        }
        if (upDirection) {
            y[0] -= Body_Size;
        }
        if (downDirection) {
            y[0] += Body_Size;
        }
    }

    //�I���P�_�]�C�������P�_�^
    private void checkCollision() {
     //���S���r��ۤv
        for (int z = body_tmp; z > 0; z--) {
            if ((x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }
        //���S���W�X���
        if (y[0] >= Panel_Height) {
            inGame = false;
        }
        if (y[0] < 0) {
            inGame = false;
        }
        if (x[0] >= Panel_Width) {
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (!inGame) {
            timer.stop();
        }
    }
    
    //�̷Ө�����׵��X�H���ܼơA�N��ӵe�����Φ�Body_Size���p���諬�A�A��ī�G�ͥX��
    //���[ ī�G���|�ͦb����
    private void locateapple() {
        int r = (int) (Math.random()%12 * ((Panel_Width/Body_Size)-2)+1);
        apple_x = r * Body_Size;

        r = (int) (Math.random()%12 * ((Panel_Height/Body_Size)-2)+1);
        apple_y = r * Body_Size;
    }
    
    //��L����
    private class Key_Detect extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!rightDirection)) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!leftDirection)) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP) && (!downDirection)) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!upDirection)) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
            
            if(key == KeyEvent.VK_ENTER) {
            	Gamestart = true;
            	Gamepause = false;
            }
            if(key == KeyEvent.VK_ESCAPE) {
            	Gamepause = true;
            }
            if(key == KeyEvent.VK_R) {
        		initGame();
            }
            if(key == KeyEvent.VK_1) {
            	difficulty = 1;
            }else if(key == KeyEvent.VK_2) {
            	difficulty = 2;
            }else if(key == KeyEvent.VK_3) {
            	difficulty = 3;
            }
        }
    }
    private void difficultyset() {
    	if(difficulty==1) {
    		body_tmp = 4;
    		Speed=140;
            timer.setDelay(Speed);
    	}else if(difficulty==2) {
    		body_tmp = 5;
    		Speed=120;
            timer.setDelay(Speed);
    	}else if(difficulty==3) {
    		body_tmp = 7;
    		Speed=100;
            timer.setDelay(Speed);
    	}
    }
    	
    public class panaladd {
    	public int hits =0; 
    	public Graphics myBuffer;
    	private int FRAMEr;
    	private int FRAMEd;
    	
    	public panaladd() {
    		super();
    		// TODO Auto-generated constructor stub
    	}
    	
		public panaladd(Graphics g,int r,int b) {
    		super();
    		myBuffer = g;
    		FRAMEr=r;
    		FRAMEd=b;
    	}
    	public void startimg()
        {
    	  myBuffer.drawImage(gress_img, 0, 0,FRAMEr,FRAMEd,null);
      	  myBuffer.setColor(Color.yellow);
      	  myBuffer.fillRect(0,FRAMEd/2-100,FRAMEr,200);
      	  myBuffer.setColor(Color.white);
    	  myBuffer.fillRect(FRAMEr/2-100,FRAMEd/2-40,200,80);
    	    
    	  myBuffer.setColor(Color.CYAN);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,50));
          myBuffer.drawString("�ۤv���G�Ʀۤv�Y", FRAMEr/2-200, 100);
          
      	  myBuffer.setColor(Color.black);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
          myBuffer.drawString("GAME START", FRAMEr/2-75, FRAMEd/2+10);
          
          myBuffer.setColor(Color.white);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
          myBuffer.drawString("Press enter to start", FRAMEr/2-85, FRAMEd-100);
        }
    	public void pauseimg()
        {
      	  myBuffer.setColor(Color.MAGENTA);
      	  myBuffer.fillRect(FRAMEr/2-150,FRAMEd/2-125,300,250);
    	  
      	  myBuffer.setColor(Color.black);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
          myBuffer.drawString("PAUSE", FRAMEr/2-35, FRAMEd/2-85);
          
          myBuffer.setColor(Color.white);
    	  myBuffer.fillRect(FRAMEr/2-125,FRAMEd/2-60,250,50);
    	  
          myBuffer.setColor(Color.black);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
          myBuffer.drawString("Press enter to resume", FRAMEr/2-105, FRAMEd/2-30);
          
          myBuffer.setColor(Color.white);
    	  myBuffer.fillRect(FRAMEr/2-125,FRAMEd/2+20,250,50);
    	  
          myBuffer.setColor(Color.black);
          myBuffer.setFont(new Font("Monospaced",Font.BOLD,24));
          myBuffer.drawString("Press R to restart", FRAMEr/2-85, FRAMEd/2+50);
        }
    	public void printdif(int dif)
        {
    		myBuffer.setColor(Color.ORANGE);
            myBuffer.setFont(new Font("Monospaced",Font.BOLD,20));
            myBuffer.drawString("��1,2,3�i�������", 10, FRAMEr-30);
          if(dif==1) {
        	  myBuffer.drawString("�{�b����:²��", 10, FRAMEr-10);
          }else if(dif==2) {
        	  myBuffer.drawString("�{�b����:���q", 10, FRAMEr-10);
          }else if(dif==3) {
        	  myBuffer.drawString("�{�b����:�x��", 10, FRAMEr-10);
          }
          
        }
    }
}