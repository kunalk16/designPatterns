package com.kk.dp.creational.simplefactory;

import java.time.LocalDateTime;

public class NewsPost extends Post {
    private LocalDateTime newsTime;
    private String headLine;

    public LocalDateTime getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }
}
