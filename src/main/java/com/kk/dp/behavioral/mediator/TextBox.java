package com.kk.dp.behavioral.mediator;

import javafx.scene.control.TextField;

public class TextBox extends TextField implements UIControl {
    private boolean mediatedUpdate;

    public TextBox(UIMediator mediator) {
        this.setText("Text Box");
        mediator.register(this);

        this.textProperty().addListener((v, o, n) -> {
            if (!mediatedUpdate) {
                mediator.valueChanged(this);
            }
        });
    }

    @Override
    public void controlChanged(UIControl control) {
        this.mediatedUpdate = true;
        this.setText(control.getControlValue());
        this.mediatedUpdate = false;
    }

    @Override
    public String getControlValue() {
        return getText();
    }

    @Override
    public String getControlName() {
        return "Text Box";
    }
}
