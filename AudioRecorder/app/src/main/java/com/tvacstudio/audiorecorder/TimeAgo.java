package com.tvacstudio.audiorecorder;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeAgo {

    public String getTimeAgo(long duration) {
        Date now = new Date();

        long seconds = TimeUnit.MILLISECONDS.toSeconds(now.getTime() - duration);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(now.getTime() - duration);
        long hours = TimeUnit.MILLISECONDS.toHours(now.getTime() - duration);
        long days = TimeUnit.MILLISECONDS.toDays(now.getTime() - duration);

        if(seconds < 60){
            return "Меньше минуты";
        } else if (minutes == 1) {
            return "Минута";
        } else if (minutes > 1 && minutes < 60) {
            return minutes + " Мин.";
        } else if (hours == 1) {
            return "Час";
        } else if (hours > 1 && hours < 24) {
            return hours + " Час.";
        } else if (days == 1) {
            return "день";
        } else {
            return days + " Суток.";
        }

    }

}
