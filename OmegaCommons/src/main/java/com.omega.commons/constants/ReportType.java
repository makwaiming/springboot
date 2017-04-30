package com.omega.commons.constants;

/**
 * Created by chenzheng on 2014-06-29.
 * <p/>
 * This ReportType is created mainly for daily email reports.
 * At the moment we only support KPI Daily report but we might extend the support for
 * other type of reports in the future.
 */
public enum ReportType {
    KPI_DAILY("KPI_DAILY", "KPI Daily Report");
    //KPI_DAILY_OVERVIEW("KPI_DAILY_OVERVIEW", "KPI Daily Overview Report"),
    //YESTERDAY_PERFORMANCE("YESTERDAY_PERFORMANCE", "Yesterday Performance By Platform Report");

    private final String code;
    private final String description;

    ReportType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ReportType fromCode(String code) {
        for (ReportType element : ReportType.values()) {
            if (element.getCode().equals(code)) {
                return element;
            }
        }
        return null;
    }

    public String toString() {
        return description;
    }

}
