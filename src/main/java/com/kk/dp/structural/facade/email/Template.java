package com.kk.dp.structural.facade.email;

public abstract class Template {
    public enum TemplateType {Email, NewsLetter};

    public abstract String format(Object obj);
}
