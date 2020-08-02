package com.kk.dp.behavioral.mediator;

public class Slider extends javafx.scene.control.Slider implements UIControl {
    private boolean mediatedUpdate;

    public Slider(UIMediator mediator) {
        this.setMin(0);
        this.setMax(50);
        this.setBlockIncrement(5);
        mediator.register(this);
        this.valueProperty().addListener((v, o, n) -> {
            if (!mediatedUpdate) {
                mediator.valueChanged(this);
            }
        });
    }

    @Override
    public void controlChanged(UIControl control) {
        mediatedUpdate = true;
        setValue(Double.parseDouble(control.getControlValue()));
        mediatedUpdate = false;
    }

    @Override
    public String getControlName() {
        return "Slider";
    }

    @Override
    public String getControlValue() {
        return Double.toString(getValue());
    }
}
