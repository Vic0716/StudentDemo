package tw.com.studentdemo;

public class BusItem {

    private String station,statS,endS,Route,Rid;

    public String getStation() {
        return station;
    }

    public String getRid() {
        return Rid;
    }

    public void setRid(String rid) {
        Rid = rid;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getStatS() {
        return statS;
    }

    public void setStatS(String statS) {
        this.statS = statS;
    }

    public String getEndS() {
        return endS;
    }

    public void setEndS(String endS) {
        this.endS = endS;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String route) {
        Route = route;
    }
}
