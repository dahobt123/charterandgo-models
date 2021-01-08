package com.charterandgo.model;

import com.charterandgo.charterhelpers.DateHelper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfferItem implements Serializable {

    private int offeritemid;
    private String suppliertype;
    private String originairportcode;
    private String originfboid;
    private String originicaocode;
    private String destinationairportcode;
    private String destinationfboid;
    private Date departuretimestamp;
    private Date arrivaltimestamp;
    private int destinationcityrating;
    private BigDecimal mileage;
    private String segmentstatus;
    private String nnumber;
    private String manufacturer;
    private String model;
    private int chartersupplierid;
    private int traveltimeminutes;
    private String triptype;
    private String crewstatus;
    private List<Crew> crews = new ArrayList<>();
    private List<Cost> costs = new ArrayList<>();
    private Price price;
    private int duration;


    public OfferItem() {

    }
@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offeritemid + "/");
        builder.append(originairportcode + "/");
        builder.append(destinationairportcode + "/");
        builder.append(segmentstatus + "/");
        builder.append(mileage + "/");
        builder.append(nnumber + "/");
        if (chartersupplierid != 0) {
            builder.append(chartersupplierid + "/");
        }
        builder.append(traveltimeminutes + "-");
        if (price != null) {
            builder.append(price.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offeritemid", offeritemid);
        obj.put("originairportcode", originairportcode);
        obj.put("originfboid", originfboid);
        obj.put("originicaocode", originicaocode);
        obj.put("destinationairportcode", destinationairportcode);
        obj.put("destinationfboid", destinationfboid);
        obj.put("segmentstatus", segmentstatus);
        obj.put("destinationcityrating", destinationcityrating);
        obj.put("mileage", mileage);
        obj.put("nnumber", nnumber);
        if (departuretimestamp != null) {
            obj.put("departuretimestamp", DateHelper.formatIsoTimestamp(departuretimestamp));
        }
        if (arrivaltimestamp != null) {
            obj.put("arrivaltimestamp", DateHelper.formatIsoTimestamp(arrivaltimestamp));
        }
        obj.put("chartersupplierid", chartersupplierid);
        obj.put("traveltimeminutes", traveltimeminutes);
        obj.put("suppliertype", suppliertype);
        obj.put("triptype", triptype);
        obj.put("crewstatus", crewstatus);
        JSONArray array = new JSONArray();
        for (Crew crew : crews) {
            array.put(crew.toJson());
        }
        obj.put("crews", array);
        JSONArray costArray = new JSONArray();
        if (!costs.isEmpty()) {
            for (Cost cost : costs) {
                costArray.put(cost.toJson());
            }
            obj.put("costs", costArray);
        }
        if (price != null) {
            obj.put("price", price.toJson());
        }
        return obj;
    }

    public int getOfferitemid() {
        return offeritemid;
    }

    public void setOfferitemid(int offeritemid) {
        this.offeritemid = offeritemid;
    }

    public String getOriginairportcode() {
        return originairportcode;
    }

    public void setOriginairportcode(String originairportcode) {
        this.originairportcode = originairportcode;
    }

    public String getDestinationairportcode() {
        return destinationairportcode;
    }

    public void setDestinationairportcode(String destinationairportcode) {
        this.destinationairportcode = destinationairportcode;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getSegmentstatus() {
        return segmentstatus;
    }

    public void setSegmentstatus(String segmentstatus) {
        this.segmentstatus = segmentstatus;
    }

    public String getNnumber() {
        return nnumber;
    }

    public void setNnumber(String nnumber) {
        this.nnumber = nnumber;
    }

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

    public int getChartersupplierid() {
        return chartersupplierid;
    }

    public void setChartersupplierid(int chartersupplierid) {
        this.chartersupplierid = chartersupplierid;
    }

    public int getTraveltimeminutes() {
        return traveltimeminutes;
    }

    public void setTraveltimeminutes(int traveltimeminutes) {
        this.traveltimeminutes = traveltimeminutes;
    }

    public String getOriginfboid() {
        return originfboid;
    }

    public void setOriginfboid(String originfboid) {
        this.originfboid = originfboid;
    }

    public String getDestinationfboid() {
        return destinationfboid;
    }

    public void setDestinationfboid(String destinationfboid) {
        this.destinationfboid = destinationfboid;
    }

    public Date getDeparturetimestamp() {
        return departuretimestamp;
    }

    public void setDeparturetimestamp(Date departuretimestamp) {
        this.departuretimestamp = departuretimestamp;
    }

    public Date getArrivaltimestamp() {
        return arrivaltimestamp;
    }

    public void setArrivaltimestamp(Date arrivaltimestamp) {
        this.arrivaltimestamp = arrivaltimestamp;
    }

    public String getSuppliertype() {
        return suppliertype;
    }

    public void setSuppliertype(String suppliertype) {
        this.suppliertype = suppliertype;
    }

    public String getTriptype() {
        return triptype;
    }

    public void setTriptype(String triptype) {
        this.triptype = triptype;
    }

    public String getCrewstatus() {
        return crewstatus;
    }

    public void setCrewstatus(String crewstatus) {
        this.crewstatus = crewstatus;
    }

    public List<Crew> getCrews() {
        return crews;
    }

    public void setCrews(List<Crew> crews) {
        this.crews = crews;
    }

    public List<Cost> getCosts() {
        return costs;
    }

    public void setCosts(List<Cost> costs) {
        this.costs = costs;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getOriginicaocode() {
        return originicaocode;
    }

    public void setOriginicaocode(String originicaocode) {
        this.originicaocode = originicaocode;
    }

    public int getDestinationcityrating() {
        return destinationcityrating;
    }

    public void setDestinationcityrating(int destinationcityrating) {
        this.destinationcityrating = destinationcityrating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
