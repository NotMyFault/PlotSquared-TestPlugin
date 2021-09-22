package dev.notmyfault.plotsquaredtest.plotsquaredtest;

import com.google.common.eventbus.Subscribe;
import com.plotsquared.core.PlotAPI;
import com.plotsquared.core.events.PlayerEnterPlotEvent;

public class P2Listener {

    // if you like the dependency-injection-like approach:
    public P2Listener(PlotAPI api) {
        api.registerListener(this);
    }

    // less OOP, but if you want to make things easy:
    public P2Listener() {
        PlotAPI api = new PlotAPI();
        api.registerListener(this);
    }

    // A method handling a PlayerEnterPlotEvent
    @Subscribe
    public void onPlayerEnterPlot(PlayerEnterPlotEvent e) {
        //do stuff
    }
}
