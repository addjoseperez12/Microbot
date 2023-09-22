package net.runelite.client.plugins.envisionplugins.breakhandler.ui.breakduration.timeamount;

import net.runelite.client.ui.ColorScheme;

import javax.swing.*;
import java.awt.*;

public class TimeAmountPanel extends JPanel {
    public TimeAmountPanel() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        setBackground(ColorScheme.DARKER_GRAY_COLOR);
        add(new MinimumTimeAmount());
        add(new MaximumTimeAmount());
    }
}
