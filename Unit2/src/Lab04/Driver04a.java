package Lab04;

import edu.fcps.Bucket;
import javax.swing.*;
public class Driver04a {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Buckets");
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BucketPanel());
        frame.setVisible(true);
        Bucket.setSpeed(5);
        Bucket.useTotal(true);
        Bucket five = new Bucket(5);
        Bucket three = new Bucket(3);
        // implement the algorithm here
    }
}