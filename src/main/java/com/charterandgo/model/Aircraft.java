package com.charterandgo.model;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aircraft implements Serializable {
    private String aac;
    private String adg;
    private double mgw;
    private String tdg;
    private String head;
    private double mtow;
    private String note;
    private String pets;
    private boolean wifi;
    private String model;
    private String galley;
    private String spare2;
    private String spare3;
    private String spare5;
    private String spare6;
    private String measure;
    private String nnumber;
    private String fueltype;
    private double headroom;
    private String homebase;
    private String icaocode;
    private long createdby;
    private int minpilots;
    private List<String> richmedia = new ArrayList<>();
    private double lengthfeet;
    private int stallknots;
    private ZonedDateTime createdtime;
    private String engineClass;
    private int numberofpax;
    private boolean oxygentanks;
    private Date activatedate;
    private String aircrafttype;
    private String manufacturer;
    private String wakecategory;
    private double wingspanfeet;
    private Date ageofaircraft;
    private int approachspeed;
    private long cagaircraftid;
    private long lastupdatedby;
    private int maxspeedknots;
    private double wheelbasefeet;
    private String aircraftstatus;
    private long emptyweightlbs;
    private long grossweightlbs;
    private int lifeexpectancy;
    private String maingearconfig;
    private int maxrampmaxtaxi;
    private double tailheightfeet;
    private String atctweightclass;
    private int landingover50ft;
    private ZonedDateTime lastupdatedtime;
    private int maxpayloadrange;
    private int numberofengines;
    private int takeoffover50ft;
    private Date fleetremovaldate;
    private int takeoffgroundrun;
    private String yearmanufactured;
    private int allengrateofclimb;
    private int businessorleasure;
    private int certificationtypel;
    private int chartersupplierid;
    private double cockpittomaingear;
    private int engoutrateofclimb;
    private int landinggroundroll;
    private int luggagesquarefeet;
    private int rangenauticalmiles;
    private int longfuelgallonshour;
    private int allengserviceceiling;
    private int engoutserviceceiling;
    private int recommendcruiseknots;
    private int shortfuelgallonshour;
    private String wingtipconfiguration;
    private int mediumfuelgallonshour;
    private int parkingareasquarefeet;
    private String faacharterregistrationid;
    private double takeofflandingpercentage;
    private int manufacturerfuelgallonshour;



    public Aircraft() {

    }
@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getNnumber() + "-");
        builder.append(getManufacturer() + "-");
        builder.append(getModel() + "-");
        builder.append(getGalley() + "-");
        builder.append(getHead() + "-");
        builder.append(Integer.toString(getNumberofpax()) + "-");
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("nnumber", nnumber);
//        obj.put("ageofaircraft", ageofaircraft);
        obj.put("manufacturer", manufacturer);
        obj.put("model", model);
//        obj.put("numberofengines", numberofengines);
        obj.put("galley", galley);
        obj.put("head", head);
        obj.put("numberofpax", numberofpax);
        JSONArray media = new JSONArray();
        obj.put("richmedia", media);
        return obj;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

//    public String getAgeofaircraft() {
//        return ageofaircraft;
//    }

//    public void setAgeofaircraft(String ageofaircraft) {
//        this.ageofaircraft = ageofaircraft;
//    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGalley() {
        return galley;
    }

    public void setGalley(String galley) {
        this.galley = galley;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getNumberofpax() {
        return numberofpax;
    }

    public void setNumberofpax(int numberofpax) {
        this.numberofpax = numberofpax;
    }

    public int getShortfuelgallonshour() {
        return shortfuelgallonshour;
    }

    public void setShortfuelgallonshour(int shortfuelgallonshour) {
        this.shortfuelgallonshour = shortfuelgallonshour;
    }

    public int getMediumfuelgallonshour() {
        return mediumfuelgallonshour;
    }

    public void setMediumfuelgallonshour(int mediumfuelgallonshour) {
        this.mediumfuelgallonshour = mediumfuelgallonshour;
    }

    public int getLongfuelgallonshour() {
        return longfuelgallonshour;
    }

    public void setLongfuelgallonshour(int longfuelgallonshour) {
        this.longfuelgallonshour = longfuelgallonshour;
    }

    public int getManufacturerfuelgallonshour() {
        return manufacturerfuelgallonshour;
    }

    public void setManufacturerfuelgallonshour(int manufacturerfuelgallonshour) {
        this.manufacturerfuelgallonshour = manufacturerfuelgallonshour;
    }

    public double getMtow() {
        return mtow;
    }

    public void setMtow(double mtow) {
        this.mtow = mtow;
    }

    public String getAac() {
        return aac;
    }

    public void setAac(String aac) {
        this.aac = aac;
    }

    public String getAdg() {
        return adg;
    }

    public void setAdg(String adg) {
        this.adg = adg;
    }

    public double getMgw() {
        return mgw;
    }

    public void setMgw(double mgw) {
        this.mgw = mgw;
    }

    public String getTdg() {
        return tdg;
    }

    public void setTdg(String tdg) {
        this.tdg = tdg;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getSpare2() {
        return spare2;
    }

    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }

    public String getSpare3() {
        return spare3;
    }

    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }

    public String getSpare5() {
        return spare5;
    }

    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }

    public String getSpare6() {
        return spare6;
    }

    public void setSpare6(String spare6) {
        this.spare6 = spare6;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public double getHeadroom() {
        return headroom;
    }

    public void setHeadroom(double headroom) {
        this.headroom = headroom;
    }

    public String getHomebase() {
        return homebase;
    }

    public void setHomebase(String homebase) {
        this.homebase = homebase;
    }

    public String getIcaocode() {
        return icaocode;
    }

    public void setIcaocode(String icaocode) {
        this.icaocode = icaocode;
    }

    public long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(long createdby) {
        this.createdby = createdby;
    }

    public int getMinpilots() {
        return minpilots;
    }

    public void setMinpilots(int minpilots) {
        this.minpilots = minpilots;
    }

    public double getLengthfeet() {
        return lengthfeet;
    }

    public void setLengthfeet(double lengthfeet) {
        this.lengthfeet = lengthfeet;
    }

    public int getStallknots() {
        return stallknots;
    }

    public void setStallknots(int stallknots) {
        this.stallknots = stallknots;
    }

    public ZonedDateTime getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(ZonedDateTime createdtime) {
        this.createdtime = createdtime;
    }

    public String getEngineClass() {
        return engineClass;
    }

    public void setEngineClass(String engineClass) {
        this.engineClass = engineClass;
    }

    public boolean isOxygentanks() {
        return oxygentanks;
    }

    public void setOxygentanks(boolean oxygentanks) {
        this.oxygentanks = oxygentanks;
    }

    public Date getActivatedate() {
        return activatedate;
    }

    public void setActivatedate(Date activatedate) {
        this.activatedate = activatedate;
    }

    public String getAircrafttype() {
        return aircrafttype;
    }

    public void setAircrafttype(String aircrafttype) {
        this.aircrafttype = aircrafttype;
    }

    public String getWakecategory() {
        return wakecategory;
    }

    public void setWakecategory(String wakecategory) {
        this.wakecategory = wakecategory;
    }

    public double getWingspanfeet() {
        return wingspanfeet;
    }

    public void setWingspanfeet(double wingspanfeet) {
        this.wingspanfeet = wingspanfeet;
    }

    public Date getAgeofaircraft() {
        return ageofaircraft;
    }

    public void setAgeofaircraft(Date ageofaircraft) {
        this.ageofaircraft = ageofaircraft;
    }

    public int getApproachspeed() {
        return approachspeed;
    }

    public void setApproachspeed(int approachspeed) {
        this.approachspeed = approachspeed;
    }

    public long getCagaircraftid() {
        return cagaircraftid;
    }

    public void setCagaircraftid(long cagaircraftid) {
        this.cagaircraftid = cagaircraftid;
    }

    public long getLastupdatedby() {
        return lastupdatedby;
    }

    public void setLastupdatedby(long lastupdatedby) {
        this.lastupdatedby = lastupdatedby;
    }

    public int getMaxspeedknots() {
        return maxspeedknots;
    }

    public void setMaxspeedknots(int maxspeedknots) {
        this.maxspeedknots = maxspeedknots;
    }

    public double getWheelbasefeet() {
        return wheelbasefeet;
    }

    public void setWheelbasefeet(double wheelbasefeet) {
        this.wheelbasefeet = wheelbasefeet;
    }

    public String getAircraftstatus() {
        return aircraftstatus;
    }

    public void setAircraftstatus(String aircraftstatus) {
        this.aircraftstatus = aircraftstatus;
    }

    public long getEmptyweightlbs() {
        return emptyweightlbs;
    }

    public void setEmptyweightlbs(long emptyweightlbs) {
        this.emptyweightlbs = emptyweightlbs;
    }

    public long getGrossweightlbs() {
        return grossweightlbs;
    }

    public void setGrossweightlbs(long grossweightlbs) {
        this.grossweightlbs = grossweightlbs;
    }

    public int getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(int lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    public String getMaingearconfig() {
        return maingearconfig;
    }

    public void setMaingearconfig(String maingearconfig) {
        this.maingearconfig = maingearconfig;
    }

    public int getMaxrampmaxtaxi() {
        return maxrampmaxtaxi;
    }

    public void setMaxrampmaxtaxi(int maxrampmaxtaxi) {
        this.maxrampmaxtaxi = maxrampmaxtaxi;
    }

    public double getTailheightfeet() {
        return tailheightfeet;
    }

    public void setTailheightfeet(double tailheightfeet) {
        this.tailheightfeet = tailheightfeet;
    }

    public String getAtctweightclass() {
        return atctweightclass;
    }

    public void setAtctweightclass(String atctweightclass) {
        this.atctweightclass = atctweightclass;
    }

    public int getLandingover50ft() {
        return landingover50ft;
    }

    public void setLandingover50ft(int landingover50ft) {
        this.landingover50ft = landingover50ft;
    }

    public ZonedDateTime getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(ZonedDateTime lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public int getMaxpayloadrange() {
        return maxpayloadrange;
    }

    public void setMaxpayloadrange(int maxpayloadrange) {
        this.maxpayloadrange = maxpayloadrange;
    }

    public int getNumberofengines() {
        return numberofengines;
    }

    public void setNumberofengines(int numberofengines) {
        this.numberofengines = numberofengines;
    }

    public int getTakeoffover50ft() {
        return takeoffover50ft;
    }

    public void setTakeoffover50ft(int takeoffover50ft) {
        this.takeoffover50ft = takeoffover50ft;
    }

    public Date getFleetremovaldate() {
        return fleetremovaldate;
    }

    public void setFleetremovaldate(Date fleetremovaldate) {
        this.fleetremovaldate = fleetremovaldate;
    }

    public int getTakeoffgroundrun() {
        return takeoffgroundrun;
    }

    public void setTakeoffgroundrun(int takeoffgroundrun) {
        this.takeoffgroundrun = takeoffgroundrun;
    }

    public String getYearmanufactured() {
        return yearmanufactured;
    }

    public void setYearmanufactured(String yearmanufactured) {
        this.yearmanufactured = yearmanufactured;
    }

    public int getAllengrateofclimb() {
        return allengrateofclimb;
    }

    public void setAllengrateofclimb(int allengrateofclimb) {
        this.allengrateofclimb = allengrateofclimb;
    }

    public int getBusinessorleasure() {
        return businessorleasure;
    }

    public void setBusinessorleasure(int businessorleasure) {
        this.businessorleasure = businessorleasure;
    }

    public int getCertificationtypel() {
        return certificationtypel;
    }

    public void setCertificationtypel(int certificationtypel) {
        this.certificationtypel = certificationtypel;
    }

    public int getChartersupplierid() {
        return chartersupplierid;
    }

    public void setChartersupplierid(int chartersupplierid) {
        this.chartersupplierid = chartersupplierid;
    }

    public double getCockpittomaingear() {
        return cockpittomaingear;
    }

    public void setCockpittomaingear(double cockpittomaingear) {
        this.cockpittomaingear = cockpittomaingear;
    }

    public int getEngoutrateofclimb() {
        return engoutrateofclimb;
    }

    public void setEngoutrateofclimb(int engoutrateofclimb) {
        this.engoutrateofclimb = engoutrateofclimb;
    }

    public int getLandinggroundroll() {
        return landinggroundroll;
    }

    public void setLandinggroundroll(int landinggroundroll) {
        this.landinggroundroll = landinggroundroll;
    }

    public int getLuggagesquarefeet() {
        return luggagesquarefeet;
    }

    public void setLuggagesquarefeet(int luggagesquarefeet) {
        this.luggagesquarefeet = luggagesquarefeet;
    }

    public int getRangenauticalmiles() {
        return rangenauticalmiles;
    }

    public void setRangenauticalmiles(int rangenauticalmiles) {
        this.rangenauticalmiles = rangenauticalmiles;
    }

    public int getAllengserviceceiling() {
        return allengserviceceiling;
    }

    public void setAllengserviceceiling(int allengserviceceiling) {
        this.allengserviceceiling = allengserviceceiling;
    }

    public int getEngoutserviceceiling() {
        return engoutserviceceiling;
    }

    public void setEngoutserviceceiling(int engoutserviceceiling) {
        this.engoutserviceceiling = engoutserviceceiling;
    }

    public int getRecommendcruiseknots() {
        return recommendcruiseknots;
    }

    public void setRecommendcruiseknots(int recommendcruiseknots) {
        this.recommendcruiseknots = recommendcruiseknots;
    }

    public String getWingtipconfiguration() {
        return wingtipconfiguration;
    }

    public void setWingtipconfiguration(String wingtipconfiguration) {
        this.wingtipconfiguration = wingtipconfiguration;
    }

    public int getParkingareasquarefeet() {
        return parkingareasquarefeet;
    }

    public void setParkingareasquarefeet(int parkingareasquarefeet) {
        this.parkingareasquarefeet = parkingareasquarefeet;
    }

    public String getFaacharterregistrationid() {
        return faacharterregistrationid;
    }

    public void setFaacharterregistrationid(String faacharterregistrationid) {
        this.faacharterregistrationid = faacharterregistrationid;
    }

    public double getTakeofflandingpercentage() {
        return takeofflandingpercentage;
    }

    public void setTakeofflandingpercentage(double takeofflandingpercentage) {
        this.takeofflandingpercentage = takeofflandingpercentage;
    }

    public List<String> getRichmedia() {
        return richmedia;
    }

    public void setRichmedia(List<String> richmedia) {
        this.richmedia = richmedia;
    }
}
