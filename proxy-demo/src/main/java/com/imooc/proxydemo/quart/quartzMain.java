package com.imooc.proxydemo.quart;

import org.quartz.*;
import org.quartz.JobDetail;
import org.quartz.impl.StdSchedulerFactory;

public class quartzMain {
    public static void main(String[] args) {
        JobDetail jobDetail = JobBuilder.newJob(HelloQuartz.class)
                .withIdentity("job1", "group1")
                .usingJobData("name", "sdas")
                .build();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).repeatForever()).build();
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        } catch (SchedulerException e){
            e.printStackTrace();
        }

    }
}
