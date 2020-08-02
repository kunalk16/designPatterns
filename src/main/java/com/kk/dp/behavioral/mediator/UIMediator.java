package com.kk.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {
    private final List<UIControl> controls;

    public UIMediator() {
        this.controls = new ArrayList<>();
    }

    public void register(UIControl control) {
        this.controls.add(control);
    }

    public void valueChanged(UIControl control) {
        controls.stream()
                .filter(c -> c != control)
                .forEach(c -> c.controlChanged(control));
    }
}
