package CapOne;
import java.awt.*;
import java.awt.event.*;

class Party{
    public static void main(String[] args) {
        buildInvite();
    }
    public static void buildInvite(){
        Frame frame = new Frame();
        Label label = new Label("Party at Kenny's");
        Button btn = new Button("Your bet");
        Button btnTwo = new Button("Shoot me");
        Panel panel = new Panel();
        panel.add(label);
    }
}
