package dev.naman.model;

import com.sun.jdi.ArrayReference;
import dev.naman.common.Constants;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Constants.Symbols>> state = new ArrayList<>();

    public List<List<Constants.Symbols>> getState() {
        return state;
    }

    public void setState(List<List<Constants.Symbols>> state) {
        this.state = state;
    }
}
