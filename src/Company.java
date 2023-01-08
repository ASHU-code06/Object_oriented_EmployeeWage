public class Company {
    private String companyName;
    private int partTimeHours;
    private int fullTimeHours;
    private int wagePerHour;
    private int monthlyWorkingDays;
    public Company(String _companyName,int _partTimeHours, int _fullTimeHours, int _wagePerHour, int _monthlyWorkingDays) {
        this.companyName=_companyName;
        this.partTimeHours = _partTimeHours;
        this.fullTimeHours = _fullTimeHours;
        this.wagePerHour = _wagePerHour;
        this.monthlyWorkingDays = _monthlyWorkingDays;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getPartTimeHours() {
        return partTimeHours;
    }
    public int getFullTimeHours() {
        return fullTimeHours;
    }
    public int getWagePerHour() {
        return wagePerHour;
    }
    public int getMonthlyWorkingDays() {
        return monthlyWorkingDays;
    }

}
