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
    private int supplierId;
    private String nnumber;
    private long cagaircraftid;
    private BigDecimal mileage;
    private int originTaxiTime;
    private int destinationTaxiTime;
    private int turnAroundTime;
    private int operationTypeFAA;
    private int traveltimeminutes;
    private String originairportcode;
    private String destinationairportcode;
    private Date departuretimestamp;
    private Date arrivaltimestamp;
    private String segmentstatus;
    private String triptype;
    private int destinationcityrating;
    private String originicaocode;
    private String origincountry;
    private List<Crew> crews = new ArrayList<>();
    private List<Cost> costs = new ArrayList<>();
    private List<Price> itemprices = new ArrayList<>();
    private String originstate;
    private String originfboid;
    private String destinationcountry;
    private String destinationstate;
    private String destinationfboid;
    private String manufacturer;
    private String model;
    private String crewstatus;
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
        if (supplierId != 0) {
            builder.append(supplierId + "/");
        }
        builder.append(traveltimeminutes + "-");
        if (!itemprices.isEmpty()) {
            builder.append(itemprices.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offeritemid", offeritemid);
        obj.put("originairportcode", originairportcode);
        obj.put("originCountry", origincountry);
        obj.put("originState", originstate);
        obj.put("originfboid", originfboid);
        obj.put("originicaocode", originicaocode);
        obj.put("destinationairportcode", destinationairportcode);
        obj.put("destinationCountry", destinationcountry);
        obj.put("destinationState", destinationstate);
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
        obj.put("chartersupplierid", supplierId);
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
        if (!itemprices.isEmpty()) {
            JSONArray prices = new JSONArray();
            obj.put("itemprices",prices);
            for (Price price : itemprices) {
                prices.put(price.toJson());
            }
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

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
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

    public List<Price> getitemprices() {
        return itemprices;
    }

    public void setitemprices(List<Price> prices) {
        this.itemprices = prices;
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

    public String getOrigincountry() {
        return origincountry;
    }

    public void setOrigincountry(String origincountry) {
        this.origincountry = origincountry;
    }

    public String getDestinationcountry() {
        return destinationcountry;
    }

    public void setDestinationcountry(String destinationcountry) {
        this.destinationcountry = destinationcountry;
    }

    public String getOriginstate() {
        return originstate;
    }

    public void setOriginstate(String originstate) {
        this.originstate = originstate;
    }

    public String getDestinationstate() {
        return destinationstate;
    }

    public void setDestinationstate(String destinationstate) {
        this.destinationstate = destinationstate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getCagaircraftid() {
        return cagaircraftid;
    }

    public void setCagaircraftid(long cagaircraftid) {
        this.cagaircraftid = cagaircraftid;
    }

    public int getOriginTaxiTime() {
        return originTaxiTime;
    }

    public void setOriginTaxiTime(int originTaxiTime) {
        this.originTaxiTime = originTaxiTime;
    }

    public int getDestinationTaxiTime() {
        return destinationTaxiTime;
    }

    public void setDestinationTaxiTime(int destinationTaxiTime) {
        this.destinationTaxiTime = destinationTaxiTime;
    }

    public int getTurnAroundTime() {
        return turnAroundTime;
    }

    public void setTurnAroundTime(int turnAroundTime) {
        this.turnAroundTime = turnAroundTime;
    }

    public int getOperationTypeFAA() {
        return operationTypeFAA;
    }

    public void setOperationTypeFAA(int operationTypeFAA) {
        this.operationTypeFAA = operationTypeFAA;
    }
}
