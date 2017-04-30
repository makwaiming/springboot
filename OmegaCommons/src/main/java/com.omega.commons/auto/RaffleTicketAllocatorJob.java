package com.omega.commons.auto;

//import org.joda.time.LocalDate;

import java.time.LocalDate;

public class RaffleTicketAllocatorJob extends AbstractJob {
//    private Logger log = Logger.getLogger(RaffleTicketAllocatorJob.class);
//    @SpringBean
//    private RaffleTicketUpdateService raffleTicketUpdateService;
//
//    @SpringBean
//    private ConfigService configService;
//
//    public static void main(String[] args) {
//        // create the job and wire it up with spring
//        RaffleTicketAllocatorJob job = new RaffleTicketAllocatorJob();
//        String[] locations = OmegaConstants.getSpringConfigLocationsNoWeb();
//        GenericApplicationContext context = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions(locations);
//        context.refresh();
//        context.registerShutdownHook();
//        ConfigurableListableBeanFactory factory = context.getBeanFactory();
//        factory.autowireBeanProperties(job, AutowireCapableBeanFactory.AUTOWIRE_BY_NAME, false);
//        job.execute();
//    }
//
    @Override
    public void execute() {
//        Boolean control = configService.getBooleanValue("raffleTicketJob.enable", false);
//
//        //TODO:Add control in registry hash
//        if (control) {
//            StopWatch stopwatch = new StopWatch();
//            stopwatch.start();
//            log.info("Executing RaffleTicketAllocatorJob.");
//            // check to see if the job is been locked
//            //TODO:Add service class
//            raffleTicketUpdateService.processTicketHistory();
//            stopwatch.stop();
//            log.info("RaffleTicketAllocatorJob execution completed in " + stopwatch.getTotalTimeSeconds() + " seconds");
//        } else {
//            log.info("RaffleTicketAllocatorJob is currently disabled");
//        }
    }
//
////    public void executeTrunk(int batchSize, int repeat) {
////        bonusTranService.processBonusHistoryBatch(batchSize, repeat);
////    }
//
    @Override
    public void execute(LocalDate date, Integer temp) {
        execute();
    }
//
//    @Override
//    public void execute(LocalDate startDate, LocalDate endDate) {
//        execute();
//    }
//
//    public RaffleTicketUpdateService getRaffleTicketUpdateService() {
//        return raffleTicketUpdateService;
//    }
//
//    public void setRaffleTicketUpdateService(RaffleTicketUpdateService raffleTicketUpdateService) {
//        this.raffleTicketUpdateService = raffleTicketUpdateService;
//    }
//
//    public ConfigService getConfigService() {
//        return configService;
//    }
//
//    public void setConfigService(ConfigService configService) {
//        this.configService = configService;
//    }
}
