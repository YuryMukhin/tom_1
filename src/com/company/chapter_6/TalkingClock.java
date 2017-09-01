package com.company.chapter_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by ymukhin on 8/30/2017.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t =  new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{
        @Override public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("Pick " + now);
            if (beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}
