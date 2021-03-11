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

    private int offerItemId;
    private String supplierType;
    private int supplierId;
    private String nnumber;
    private long cagAircraftId;
    private BigDecimal mileage;
    private int originTaxiTime;
    private int destinationTaxiTime;
    private int turnAroundTime;
    private int charterSegmentType;
    private int operationTypeFAA;
    private int travelTimeMinutes;
    private String originAirportCode;
    private String destinationAirportCode;
    private Date departureTimestamp;
    private Date arrivalTimestamp;
    private String aircraftType;
    private String segmentStatus;
    private String tripType;
    private int destinationCityRating;
    private String originIcaoCode;
    private String originCountry;
    private List<Crew> crews = new ArrayList<>();
    private List<Cost> costs = new ArrayList<>();
    private List<Price> itemPrices = new ArrayList<>();
    private String originState;
    private String originFboId;
    private String destinationCountry;
    private String destinationState;
    private String destinationFboId;
    private String manufacturer;
    private String model;
    private String crewstatus;
    private int duration;


    public OfferItem() {

    }
@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(offerItemId + "/");
        builder.append(originAirportCode + "/");
        builder.append(destinationAirportCode + "/");
        builder.append(segmentStatus + "/");
        builder.append(mileage + "/");
        builder.append(nnumber + "/");
        if (supplierId != 0) {
            builder.append(supplierId + "/");
        }
        builder.append(travelTimeMinutes + "-");
        if (!itemPrices.isEmpty()) {
            builder.append(itemPrices.toString());
        }
        return builder.toString();
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();
        obj.put("offerItemId", offerItemId);
        obj.put("originAirportCode", originAirportCode);
        obj.put("originCountry", originCountry);
        obj.put("originState", originState);
        obj.put("originFboId", originFboId);
        obj.put("originIcaoCode", originIcaoCode);
        obj.put("destinationAirportCode", destinationAirportCode);
        obj.put("destinationCountry", destinationCountry);
        obj.put("destinationState", destinationState);
        obj.put("destinationFboId", destinationFboId);
        obj.put("segmentStatus", segmentStatus);
        obj.put("destinationCityRating", destinationCityRating);
        obj.put("mileage", mileage);
        obj.put("nnumber", nnumber);
        if (departureTimestamp != null) {
            obj.put("departureTimestamp", DateHelper.formatIsoTimestamp(departureTimestamp));
        }
        if (arrivalTimestamp != null) {
            obj.put("arrivalTimeStamp", DateHelper.formatIsoTimestamp(arrivalTimestamp));
        }
        obj.put("supplierId", supplierId);
        obj.put("travelTimeMinutes", travelTimeMinutes);
        obj.put("supplierType", supplierType);
        obj.put("tripType", tripType);
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
        if (!itemPrices.isEmpty()) {
            JSONArray prices = new JSONArray();
            obj.put("itemprices",prices);
            for (Price price : itemPrices) {
                prices.put(price.toJson());
            }
        }
        return obj;
    }

    public int getOfferItemId() {
        return offerItemId;
    }

    public void setOfferItemId(int offerItemId) {
        this.offerItemId = offerItemId;
    }

    public String getOriginAirportCode() {
        return originAirportCode;
    }

    public void setOriginAirportCode(String originAirportCode) {
        this.originAirportCode = originAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(String destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getSegmentStatus() {
        return segmentStatus;
    }

    public void setSegmentStatus(String segmentStatus) {
        this.segmentStatus = segmentStatus;
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

    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }

    public void setTravelTimeMinutes(int travelTimeMinutes) {
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public String getOriginFboId() {
        return originFboId;
    }

    public void setOriginFboId(String originFboId) {
        this.originFboId = originFboId;
    }

    public String getDestinationFboId() {
        return destinationFboId;
    }

    public void setDestinationFboId(String destinationFboId) {
        this.destinationFboId = destinationFboId;
    }

    public Date getDepartureTimestamp() {
        return departureTimestamp;
    }

    public void setDepartureTimestamp(Date departureTimestamp) {
        this.departureTimestamp = departureTimestamp;
    }

    public Date getArrivalTimestamp() {
        return arrivalTimestamp;
    }

    public void setArrivalTimestamp(Date arrivalTimestamp) {
        this.arrivalTimestamp = arrivalTimestamp;
    }

    public String getSupplierType() {
        return supplierType;
    }

    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
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
        return itemPrices;
    }

    public void setitemprices(List<Price> prices) {
        this.itemPrices = prices;
    }

    public String getOriginIcaoCode() {
        return originIcaoCode;
    }

    public void setOriginIcaoCode(String originIcaoCode) {
        this.originIcaoCode = originIcaoCode;
    }

    public int getDestinationCityRating() {
        return destinationCityRating;
    }

    public void setDestinationCityRating(int destinationCityRating) {
        this.destinationCityRating = destinationCityRating;
    }

    public String getOrigincountry() {
        return originCountry;
    }

    public void setOrigincountry(String origincountry) {
        this.originCountry = origincountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getOriginState() {
        return originState;
    }

    public void setOriginState(String originState) {
        this.originState = originState;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getCagAircraftId() {
        return cagAircraftId;
    }

    public void setCagAircraftId(long cagAircraftId) {
        this.cagAircraftId = cagAircraftId;
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

    public int getCharterSegmentType() {
        return charterSegmentType;
    }

    public void setCharterSegmentType(int charterSegmentType) {
        this.charterSegmentType = charterSegmentType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
}
