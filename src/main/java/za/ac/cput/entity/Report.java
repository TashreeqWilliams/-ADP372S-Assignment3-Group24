package za.ac.cput.entity;

/*
 Entity for Report
 Author: Mlungisi Xakekile (215126505)
 Date: 01 June 2021
*/

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Report implements Serializable {
    @Id
    private String reportId;
    private String reportAuth, report, reportDate;


    private Report(){}

    private Report( Builder builder) {
        this.reportId = builder.reportId;
        this.reportAuth = builder.reportAuth;
        this.report = builder.report;
        this.reportDate = builder.reportDate;
    }

    public String getReportId() {
        return reportId;
    }

    public String getReport() {
        return report;
    }

    public String getReportAuth() {

        return reportAuth;
    }

    public String getReportDate() {

        return reportDate;
    }

    public String toString() {
        return "Report{" +
                "reportId=" + reportId +
                ", reportAuth=" + reportAuth +
                ", report=" + report +
                ", reportDate=" + reportDate +
                '}';
    }


    public static class Builder {
        private String reportId, reportAuth, reportDate, report;

        public Builder setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        public Builder setReport(String report) {
            this.report = report;
            return this;
        }

        public Builder setReportAuth(String reportAuth) {
            this.reportAuth = reportAuth;
            return this;
        }

        public Builder setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }

        public Builder copy(Report report) {
            this.reportId = report.reportId;
            this.reportAuth = report.reportAuth;
            this.reportDate = report.reportDate;
            this.report = report.report;
            return this;
        }

        public Report build() {
            return new Report(this);

        }
    }
}

