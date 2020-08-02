package com.kk.dp.behavioral.mediator;

public interface UIControl {
    void controlChanged(UIControl control);

    String getControlName();

    String getControlValue();
}
