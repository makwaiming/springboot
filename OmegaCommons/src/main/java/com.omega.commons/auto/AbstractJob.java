package com.omega.commons.auto;

import com.omega.commons.constants.JobStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
//import org.joda.time.LocalDate;

public abstract class AbstractJob {
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected JobStatus status;
    protected String message;
    protected StringBuilder messageBuilder;
    private Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    
    public abstract void execute();
    public abstract void execute(LocalDate date, Integer temp);

    public void execute(LocalDate startDate, LocalDate endDate, Integer temp){
        log.info("Executing job between " + startDate.toString() + " and " + endDate.toString());
        this.startDate = startDate;
        this.endDate = endDate;
        messageBuilder = new StringBuilder();
        LocalDate date = startDate;
        while (!date.isAfter(endDate)) {
            this.execute(date, temp);
            date = date.plusDays(1);
        }
    }

    public void execute(LocalDate startDate, LocalDate endDate){
        this.execute(startDate, endDate, null);
    }
    
    protected void logMessage(String message) {
        if (messageBuilder == null) {
            messageBuilder = new StringBuilder();
        }
        messageBuilder.append("\n").append(message);
        message = messageBuilder.toString();
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public String getMessage() {
        message = messageBuilder.toString();
        return message;
    }
}
