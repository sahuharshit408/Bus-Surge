package my.app.bussurge;

public class dataholder {

    String name,contact,college,accsoft,enroll,year,pimage;

    public dataholder(String name, String contact, String college, String accsoft, String enroll, String year, String pimage) {
        this.name = name;
        this.contact = contact;
        this.college = college;
        this.accsoft = accsoft;
        this.enroll = enroll;
        this.year = year;
        this.pimage = pimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getAccsoft() {
        return accsoft;
    }

    public void setAccsoft(String accsoft) {
        this.accsoft = accsoft;
    }

    public String getEnroll() {
        return enroll;
    }

    public void setEnroll(String enroll) {
        this.enroll = enroll;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }
}
