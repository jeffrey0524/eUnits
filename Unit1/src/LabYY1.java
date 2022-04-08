    import edu.fcps.karel2.*;
    public class LabYY1 {
        public static void main(String[] args) {
            final int N = (int)(Math.random() * 10 + 2);
            int i = 0;
            int j = 0;
            int r = 0;
            Display.setSize(N, N);
            Display.setSpeed(10);
            WorldBackend.getCurrent().putBeepers((int)(Math.random() * N +1), (int)(Math.random() * N +1), 1);

            Seeker karel = new Seeker();
            
            //����
            for (i = 0; i < N; i++) {
                for (j = 0; j < N - 1; j++) {
                    if (karel.nextToABeeper()) {
                        karel.pickBeeper();
                        r = 1;
                        break;
                    } 
                    else {
                        karel.move();
                    }
                }
                if (karel.nextToABeeper()) {
                    karel.pickBeeper();
                    r = 1;
                    break;
                }
                if (r != 1) {
                    if(i%2==1) {
                        karel.turnar2();
                    }
                    else {
                        karel.turnar1();
                    }
                }
                else {
                    break;
                }
            }
            
            //�^���I
            if(i%2==1) {
                karel.turnRight();
                while(karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                while(karel.frontIsClear()) {
                    karel.move();
                }
            }
            else {
                karel.turnLeft();
                while(karel.frontIsClear()) {
                    karel.move();
                }
                karel.turnLeft();
                while(karel.frontIsClear()) {
                    karel.move();
                }
            }
        }
    }